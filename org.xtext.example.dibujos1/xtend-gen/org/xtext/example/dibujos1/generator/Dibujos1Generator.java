package org.xtext.example.dibujos1.generator;

import com.google.common.collect.Iterators;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.dibujos1.dibujos1.Circulo;
import org.xtext.example.dibujos1.dibujos1.Color;
import org.xtext.example.dibujos1.dibujos1.Estilo;
import org.xtext.example.dibujos1.dibujos1.Fuente;
import org.xtext.example.dibujos1.dibujos1.Instruccion;
import org.xtext.example.dibujos1.dibujos1.Linea;
import org.xtext.example.dibujos1.dibujos1.Modelo;
import org.xtext.example.dibujos1.dibujos1.Punto;
import org.xtext.example.dibujos1.dibujos1.Rectangulo;
import org.xtext.example.dibujos1.dibujos1.Texto;

@SuppressWarnings("all")
public class Dibujos1Generator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Modelo modelo = IterableExtensions.<Modelo>head(IteratorExtensions.<Modelo>toList(Iterators.<Modelo>filter(resource.getAllContents(), Modelo.class)));
    if ((modelo == null)) {
      return;
    }
    final StringBuilder builder = new StringBuilder();
    EList<Instruccion> _instrucciones = modelo.getInstrucciones();
    for (final Instruccion instr : _instrucciones) {
      boolean _matched = false;
      if (instr instanceof Circulo) {
        _matched=true;
        builder.append("C ").append(((Circulo)instr).getX()).append(" ").append(((Circulo)instr).getY()).append(" ").append(((Circulo)instr).getR()).append("\n");
      }
      if (!_matched) {
        if (instr instanceof Rectangulo) {
          _matched=true;
          builder.append("R ").append(((Rectangulo)instr).getX1()).append(" ").append(((Rectangulo)instr).getY1()).append(" ").append(((Rectangulo)instr).getX2()).append(" ").append(((Rectangulo)instr).getY2()).append(" ").append(((Rectangulo)instr).getX3()).append(" ").append(((Rectangulo)instr).getY3()).append(" ").append(((Rectangulo)instr).getX4()).append(" ").append(((Rectangulo)instr).getY4()).append("\n");
        }
      }
      if (!_matched) {
        if (instr instanceof Linea) {
          _matched=true;
          builder.append("L ").append(((Linea)instr).getX1()).append(" ").append(((Linea)instr).getY1()).append(" ").append(((Linea)instr).getX2()).append(" ").append(((Linea)instr).getY2()).append("\n");
        }
      }
      if (!_matched) {
        if (instr instanceof Texto) {
          _matched=true;
          builder.append("T ").append(((Texto)instr).getX()).append(" ").append(((Texto)instr).getY()).append(" ").append("\"").append(((Texto)instr).getTexto()).append("\"").append("\n");
        }
      }
      if (!_matched) {
        if (instr instanceof Punto) {
          _matched=true;
          builder.append("P ").append(((Punto)instr).getX()).append(" ").append(((Punto)instr).getY()).append("\n");
        }
      }
      if (!_matched) {
        if (instr instanceof Color) {
          _matched=true;
          final String tipo = ((Color)instr).eClass().getName();
          builder.append(tipo).append(" ").append(((Color)instr).getColor()).append("\n");
        }
      }
      if (!_matched) {
        if (instr instanceof Estilo) {
          _matched=true;
          builder.append("SW ").append(((Estilo)instr).getValor()).append("\n");
        }
      }
      if (!_matched) {
        if (instr instanceof Fuente) {
          _matched=true;
          builder.append("FS ").append(((Fuente)instr).getValor()).append("\n");
        }
      }
    }
    fsa.generateFile("salida.dibujo", builder.toString());
  }
}
