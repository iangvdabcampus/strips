package be.vdab.strips.controllers;

import be.vdab.strips.domain.Figuur;
import be.vdab.strips.services.FiguurService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("figuren")
class FiguurController {
  private final FiguurService figuurService;

  public FiguurController(FiguurService figuurService) {
    this.figuurService = figuurService;
  }

  @GetMapping
  List<Figuur> findAll() {
    return figuurService.findAll();
  }
}
