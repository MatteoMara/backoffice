package it.mediacontents.backoffice.web.controller.api;

import it.mediacontents.backoffice.entities.Brand;
import it.mediacontents.backoffice.entities.SupplierTool;
import it.mediacontents.backoffice.entities.Tool;
import it.mediacontents.backoffice.suppliers.tools.ToolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ToolsApiController {

    private ToolService toolService;

    public ToolsApiController(ToolService toolService) {
        this.toolService = toolService;
    }

    @GetMapping(value = "/tools", params = "supplierId")
    public ResponseEntity<List<SupplierTool>> getToolsBySupplierId(@RequestParam Long supplierId) {
        List<SupplierTool> tools = toolService.getToolsBySupplierId(supplierId);
        return new ResponseEntity<>(tools, HttpStatus.OK);
    }

    @GetMapping(value = "/tools", params = "brandId")
    public ResponseEntity<List<Tool>> getAvailableToolsByBrandId(@RequestParam Long brandId) {
        List<Tool> tools = toolService.getAvailableToolsByBrandId(brandId);
        return new ResponseEntity<>(tools, HttpStatus.OK);
    }

    @GetMapping(value = "/brands")
    public ResponseEntity<List<Brand>> getAvailableBrands() {
        List<Brand> brands = toolService.getAvailableBrands();
        return new ResponseEntity<>(brands, HttpStatus.OK);
    }


}
