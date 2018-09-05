-- TEST BRANDS
insert into brand values(1, 'Nikon', 'http://www.nikon.com');
insert into brand values(2, 'Canon', 'http://www.canon.com');
insert into brand values(3, 'DJI', 'http://www.dji.com');

-- TEST TOOLS
insert into tool values(1,'Lens','18-105mm AFS-DX',1);
insert into tool values(2,'Lens','35mm AFS-DX',1);
insert into tool values(3,'Camera Body','D7000',1);
insert into tool values(4,'Camera Body','D3',1);

insert into tool values(5,'Lens','18-105mm White',2);
insert into tool values(6,'Lens','50mm APS-C',2);
insert into tool values(7,'Camera Body','1D',2);
insert into tool values(8,'Camera Body','5D Mark IV',2);

insert into tool values(9,'Drone','Mavic Pro 2',3);
insert into tool values(10,'Gimball','OSMO 2',3);
insert into tool values(11,'Drone','Phantom 4',3);

-- TEST JOB TYPES
insert into job_type values(1, 'Video - Evento', 'Servizio video per evento');
insert into job_type values(2, 'Video - Intervista', 'Servizio video per intervista');
insert into job_type values(3, 'Video - Promozionale', 'Servizio video per evento promozionale');
insert into job_type values(4, 'Foto - Evento', 'Servizio foto per evento');
insert into job_type values(5, 'Foto - Ritratto', 'Servizio foto per ritratti');
insert into job_type values(6, 'Foto - Promozionale', 'Servizio foto per evento promozionale');

-- TEST CONTACT TYPES
insert into contact_type values(1, 'Telefono mobile', 'Mobile');
insert into contact_type values(2, 'Telefono fisso', 'Fisso');
insert into contact_type values(3, 'Contatto email', 'Email');
insert into contact_type values(4, 'Fax', 'Fax');
insert into contact_type values(5, 'Sito web personale', 'link');
insert into contact_type values(6, 'Numero associato whatsapp', 'Whatpsapp');

-- TEST SUPPLIERS
insert into supplier values(1, 'Matteo', 'Mara', '************', 0, CURRENT_DATE, 'mmara', '12374642432464');
insert into supplier values(2, 'Arianna', 'Mori', '************', 0, CURRENT_DATE, 'amori', '12374642432465');
insert into supplier values(3, 'Paolo', 'Gianfrancesco', '************', 0, CURRENT_DATE, 'pgianfra', '12374642432466');

-- TEST SUPPLIER CONTACTS
insert into contact values(1,CURRENT_TIMESTAMP, 1, null ,'matte.mara@email.it', 3);
insert into contact values(2,CURRENT_TIMESTAMP, 2, null , 'arianna.mori@email.it', 3);
insert into contact values(3,CURRENT_TIMESTAMP, 3, null, 'p.gianfra@email.it', 3);
insert into contact values(4,CURRENT_TIMESTAMP, 1, null ,'+39123456789', 1);

-- TEST SUPPLIER TOOLS
insert into supplier_tool values(1, CURRENT_TIMESTAMP, 1, null, 3);
insert into supplier_tool values(2, CURRENT_TIMESTAMP, 1, null, 2);
insert into supplier_tool values(3, CURRENT_TIMESTAMP, 2, null, 9);
insert into supplier_tool values(4, CURRENT_TIMESTAMP, 3, null, 5);
insert into supplier_tool values(5, CURRENT_TIMESTAMP, 3, null, 8);

-- TEST SUPPLIER RANGE
insert into availability_range values(1, 'Cagliari', 100, 1, 2);
insert into availability_range values(2, 'Milano', 200, 2, 3);
insert into availability_range values(3, 'Roma', 300, 3, 4);


-- TEST SUPPLIER CAPABILITIES
insert into supplier_capability values(1, 1, 4);
insert into supplier_capability values(2, 1, 5);
insert into supplier_capability values(3, 1, 6);
insert into supplier_capability values(4, 2, 1);
insert into supplier_capability values(5, 3, 1);
insert into supplier_capability values(6, 3, 4);
insert into supplier_capability values(7, 3, 6);

-- TEST SUPPLIER PORTFOLIO
insert into portfolio_entry values(1, 1, 'Portfolio foto M.Mara', null, current_timestamp );
insert into portfolio_entry values(2, 2, 'Portfolio foto Ritratto M.Mara', null, current_timestamp );
insert into portfolio_entry values(3, 3, 'Portfolio foto Promozionale M.Mara', null, current_timestamp );