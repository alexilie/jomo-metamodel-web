package com.jomo.eorganism.metamodel.web.controller;

import com.jomo.eorganism.metamodel.web.service.ApplicationService;
import com.jomo.eorganism.metamodel.web.service.ComponentService;
import com.jomo.eorganism.metamodel.web.service.DatabaseService;
import com.jomo.eorganism.metamodel.web.service.SystemService;
import com.jomo.eorganism.metamodel.web.service.DomainService;
import com.jomo.eorganism.metamodel.web.service.ReleaseService;
import com.jomo.eorganism.metamodel.web.service.EnvironmentService;
import com.jomo.eorganism.metamodel.web.service.MetadataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MetamodelWebController {
    private ApplicationService applicationService;
    private ComponentService componentService;
    private DatabaseService databaseService;
    private DomainService domainService;
    private SystemService systemService;
    private ReleaseService releaseService;
    private EnvironmentService environmentService;
    private MetadataService metadataService;

    @Autowired
    public void setApplicationService(ApplicationService applicationService) { this.applicationService = applicationService; }

    @Autowired
    public void setComponentService(ComponentService componentService) {
        this.componentService = componentService;
    }

    @Autowired
    public void setDatabaseService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    @Autowired
    public void setDomainService(DomainService domainService) {
        this.domainService = domainService;
    }

    @Autowired
    public void setSystemService(SystemService systemService) {
        this.systemService = systemService;
    }

    @Autowired
    public void setReleaseService(ReleaseService releaseService) {
        this.releaseService = releaseService;
    }

    @Autowired
    public void setEnvironmentService(EnvironmentService environmentService) {  this.environmentService = environmentService;
    }

    @Autowired
    public void setMetamodelService(MetadataService metadataService) {  this.metadataService = metadataService;
    }

    @GetMapping("/applications")
    public String retrieveApplications(Model model){
        model.addAttribute("applications", applicationService.listApplications());
        return "applications";
    }

    @GetMapping("/components")
    public String retrieveComponents(Model model){
        model.addAttribute("components", componentService.listComponents());
        return "components";
    }

    @GetMapping("/databases")
    public String retrieveDatabases(Model model){
        model.addAttribute("databases", databaseService.listDatabases());
        return "databases";
    }

    @GetMapping("/domains")
    public String retrieveDomains(Model model){
        model.addAttribute("domains", domainService.listDomains());
        return "domains";
    }

    @GetMapping("/systems")
    public String retrieveSystems(Model model){
        model.addAttribute("systems", systemService.listSystems());
        return "systems";
    }
    @GetMapping("/releases")
    public String retrieveReleases(Model model){
        model.addAttribute("releases", releaseService.listReleases());
        return "releases";
    }
    @GetMapping("/environments")
    public String retrieveEnvironments(Model model){
        model.addAttribute("environments", environmentService.listEnvironments());
        return "environments";
    }

    @GetMapping("/metadatas")
    public String retrieveMetadatas(Model model){
        model.addAttribute("metadatas", metadataService.listMetadatas());
        return "metadatas";
    }
}
