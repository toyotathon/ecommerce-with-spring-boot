package com.cakefactory.app.catalog;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/catalog")
public class CatalogController {
  private final CatalogService catalogService;

  CatalogController(CatalogService catalogService) {
    this.catalogService = catalogService;
  }

  @GetMapping()
  ModelAndView index() {
    return new ModelAndView("catalog", Map.of("items", this.catalogService.getItems()));
  }
}