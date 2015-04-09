package org.exoplatform.addon.service.asciidoctor;

import org.asciidoctor.Asciidoctor;

import java.util.HashMap;

import static org.asciidoctor.Asciidoctor.Factory.create;


public class AsciiDoctorService {

       public String convertAsciiDoc(String text)
       {
           Asciidoctor asciidoctor = create();
           return asciidoctor.convert(
                   text,
                   new HashMap<String, Object>());

       }
}
