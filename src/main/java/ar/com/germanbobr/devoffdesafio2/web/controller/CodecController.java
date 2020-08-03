package ar.com.germanbobr.devoffdesafio2.web.controller;

import ar.com.germanbobr.devoffdesafio2.core.Codec;
import ar.com.germanbobr.devoffdesafio2.web.dto.CodecRequest;
import ar.com.germanbobr.devoffdesafio2.web.dto.CodecResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/")
@CrossOrigin
public class CodecController {
    @Autowired
    private Codec codec;

    @PostMapping("/encode")
    public CodecResponse encode(@RequestBody CodecRequest request) {
        return new CodecResponse(codec.encode(request.getMensaje(), request.getVueltas()));
    }

    @PostMapping("/decode")
    public CodecResponse decode(@RequestBody CodecRequest request) {
        return new CodecResponse(codec.decode(request.getMensaje(), request.getVueltas()));
    }

    @GetMapping
    public void index(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }
}
