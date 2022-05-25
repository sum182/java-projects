package br.com.alura.mvc.mudi;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import br.com.alura.mvc.mudi.interceptor.InterceptadorDeAcessos;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
devemos utilizar WebMvcConfigurer ao inves de WebMvcConfigurationSupport no webConfig
a WebMvcConfigurationSupport foi atualizada para WebMvcConfigurer

isso serve para rodar o Swagger

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

  @Override
  protected void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new InterceptadorDeAcessos()).addPathPatterns("/**");
  }
*/

@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new InterceptadorDeAcessos()).addPathPatterns("/**");
  }
}
