package com.cakefactory.app.catalog;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/catalog")
public class CatalogController {
  // private final CatalogService catalogService;

  @GetMapping()
  ModelAndView index() {
    log.info(ItemUtils.getBaseItems().toString());
    return new ModelAndView("catalog", Map.of("items", ItemUtils.getBaseItems()));
  }
}