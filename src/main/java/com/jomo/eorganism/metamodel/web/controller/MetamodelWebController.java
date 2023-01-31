package com.jomo.eorganism.metamodel.web.controller;

import com.jomo.eorganism.metamodel.web.MetamodelWebApplication;
import com.jomo.eorganism.metamodel.web.entity.ApplicationEntity;
import com.jomo.eorganism.metamodel.web.repository.ApplicationRepository;
import com.jomo.eorganism.metamodel.web.service.ApplicationService;
import com.jomo.eorganism.metamodel.web.service.ComponentService;
import com.jomo.eorganism.metamodel.web.service.DatabaseService;
import com.jomo.eorganism.metamodel.web.service.SystemService;
import com.jomo.eorganism.metamodel.web.service.DomainService;
import com.jomo.eorganism.metamodel.web.service.ReleaseService;
import com.jomo.eorganism.metamodel.web.service.EnvironmentService;
import com.jomo.eorganism.metamodel.web.service.MetadataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
public class MetamodelWebController {
    private static final Logger log = LoggerFactory.getLogger(MetamodelWebController.class);

    private ApplicationService applicationService;
    private ComponentService componentService;
    private DatabaseService databaseService;
    private DomainService domainService;
    private SystemService systemService;
    private ReleaseService releaseService;
    private EnvironmentService environmentService;
    private MetadataService metadataService;

    private ApplicationEntity applicationEntity;

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
    public void setEnvironmentService(EnvironmentService environmentService) {  this.environmentService = environmentService; }

    @Autowired
    public void setMetamodelService(MetadataService metadataService) {  this.metadataService = metadataService; }

    // Applications
    @GetMapping("/applications")
    public String retrieveApplications(Model model){
        model.addAttribute("applications", applicationService.listApplications());
        return "applications";
    }

    @GetMapping("/applications-new")
    public String addNewApplication(Model model){
        ApplicationEntity  applicationEntity = new ApplicationEntity();
        model.addAttribute("application", applicationEntity);
        return "applications-new";
    }

    @GetMapping("/applications-update-form")
    public String showAddNewAppForm(){
        return "applications-update";
    }

    @GetMapping("/applications-edit/{id}")
    public String editApplication(@PathVariable("id") Integer id, Model model){
        ApplicationEntity  applicationEntity = applicationService.findApplication(id);
        model.addAttribute("application", applicationEntity);
        return "applications-edit";
    }

    @PostMapping("/applications")
    public String addApplication(Model model, ApplicationEntity applicationEntity){
        model.addAttribute("application", applicationEntity);
        log.info("addApplication - " + applicationEntity.toString());
        ApplicationEntity addApplication = new ApplicationEntity();

        try{
            addApplication = applicationService.addApplication(applicationEntity);
        }catch(Exception e){
            log.info("addApplication FAILED exception: - " + e.toString());
            return "errors";
        }


        if (addApplication == null) {
            log.info("addApplication FAILED - ");
            return "errors";
        }

        log.info("addApplication SUCCESS - ");
        return "applications";
    }

    @PostMapping("/applications/{id}")
    public String updateApplicationAdd( @PathVariable("id") Integer id, Model model, ApplicationEntity applicationEntity){
        model.addAttribute("application", applicationEntity);
        log.info("updateApplication - " + applicationEntity.toString());
        applicationEntity.setId(id);
        ApplicationEntity updatedApplication = new ApplicationEntity();
        try{
            updatedApplication = applicationService.updateById(id, applicationEntity);
        }catch(Exception e){
            log.info("updateApplication FAILED exception: - " + e.toString());
            return "errors";
        }

        if (updatedApplication == null) {
            log.info("updateApplication FAILED - ");
            return "errors";
        } else {
            log.info("updateApplication SUCCESS - ");
            return "applications";
        }
    }

    @DeleteMapping("/applications")
    public String deleteApplication(@PathVariable("id") Integer id){
        log.info("deleteApplication id - " + id);
        applicationService.deleteById(id);

        try{
            applicationService.deleteById(id);
        }catch(Exception e){
            log.info("deleteApplication FAILED exception: - " + e.toString());
            return "errors";
        }

        return "applications";
    }

    // Components
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

    @GetMapping("/search")
    public String retrieveSearch(){
        return "search";
    }

    @GetMapping("/documentation")
    public String retrieveDocumentation(){
        return "documentation";
    }

    @GetMapping("/errors")
    public String retrieveErrors(){
        return "errors";
    }
}
