package com.itb.inf2fm.pizzariadocrioulo.controller;

package com.itb.inf2fm.pizzarianeymar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itb.inf2fm.pizzarianeymar.model.services.ProdutoService;

// @controller: Sistema Web (Sites em geral)
// @RestController: Api

@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutoController {

    private ProdutoService produtoService = new ProdutoService();

}

