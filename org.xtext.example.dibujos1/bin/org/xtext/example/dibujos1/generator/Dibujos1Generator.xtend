package org.xtext.example.dibujos1.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.dibujos1.dibujos1.Circulo
import org.xtext.example.dibujos1.dibujos1.Color
import org.xtext.example.dibujos1.dibujos1.Estilo
import org.xtext.example.dibujos1.dibujos1.Fuente
import org.xtext.example.dibujos1.dibujos1.Linea
import org.xtext.example.dibujos1.dibujos1.Modelo
import org.xtext.example.dibujos1.dibujos1.Punto
import org.xtext.example.dibujos1.dibujos1.Rectangulo
import org.xtext.example.dibujos1.dibujos1.Texto

class Dibujos1Generator extends AbstractGenerator {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        val modelo = resource.allContents.filter(Modelo).toList.head
        if (modelo === null) return

        val builder = new StringBuilder

        for (instr : modelo.instrucciones) {
            switch instr {
                Circulo: builder.append("C ")
                    .append(instr.x).append(" ")
                    .append(instr.y).append(" ")
                    .append(instr.r).append("\n")

                Rectangulo: builder.append("R ")
                    .append(instr.x1).append(" ").append(instr.y1).append(" ")
                    .append(instr.x2).append(" ").append(instr.y2).append(" ")
                    .append(instr.x3).append(" ").append(instr.y3).append(" ")
                    .append(instr.x4).append(" ").append(instr.y4).append("\n")

                Linea: builder.append("L ")
                    .append(instr.x1).append(" ").append(instr.y1).append(" ")
                    .append(instr.x2).append(" ").append(instr.y2).append("\n")

                Texto: builder.append("T ")
                    .append(instr.x).append(" ").append(instr.y).append(" ")
                    .append("\"").append(instr.texto).append("\"").append("\n")

                Punto: builder.append("P ")
                    .append(instr.x).append(" ").append(instr.y).append("\n")

                Color: {
                    val tipo = instr.eClass.name
                    builder.append(tipo).append(" ").append(instr.color).append("\n")
                }

                Estilo: builder.append("SW ").append(instr.valor).append("\n")

                Fuente: builder.append("FS ").append(instr.valor).append("\n")
            }
        }

        fsa.generateFile("salida.dibujo", builder.toString)
    }
}
