package it.mediacontents.backoffice.suppliers.tools;

import it.mediacontents.backoffice.entities.Brand;
import it.mediacontents.backoffice.entities.SupplierTool;
import it.mediacontents.backoffice.entities.Tool;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ToolService {

    private SupplierToolRepository supplierToolRepository;
    private BrandRepository brandRepository;
    private ToolRepository toolRepository;

    public ToolService(SupplierToolRepository supplierToolRepository, BrandRepository brandRepository, ToolRepository toolRepository) {
        this.supplierToolRepository = supplierToolRepository;
        this.brandRepository = brandRepository;
        this.toolRepository = toolRepository;
    }

    public List<Brand> getAvailableBrands() {
        List<Brand> brands = new ArrayList<>();
        brandRepository.findAll().forEach(brands::add);
        return brands;
    }

    public List<Tool> getAvailableToolsByBrandId(Long brandId) {
        List<Tool> availableTools = new ArrayList<>();
        availableTools.addAll(toolRepository.findByBrand(new Brand(brandId)));
        return availableTools;
    }

    public Optional<SupplierTool> getToolById(Long contactId) {
        return supplierToolRepository.findById(contactId);
    }

    public List<SupplierTool> getToolsBySupplierId(Long supplierId) {
        return supplierToolRepository.findBySupplierId(supplierId);
    }

    public SupplierTool saveTool(SupplierTool supplierTool) {
        return supplierToolRepository.save(supplierTool);
    }

    public void deleteTool(SupplierTool supplierTool) {
        supplierToolRepository.delete(supplierTool);
    }

    public void deleteTool(Long toolId) {
        supplierToolRepository.deleteById(toolId);
    }

}
