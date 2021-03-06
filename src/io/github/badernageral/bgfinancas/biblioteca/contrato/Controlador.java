/*
Copyright 2012-2017 Jose Robson Mariano Alves

This file is part of bgfinancas.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This package is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.

*/

package io.github.badernageral.bgfinancas.biblioteca.contrato;

import io.github.badernageral.bgfinancas.idioma.Linguagem;

public interface Controlador {
    
    public Linguagem idioma = Linguagem.getInstance();
    
    public void acaoCadastrar(int botao);
    public void acaoAlterar(int tabela);
    public void acaoExcluir(int botao);
    public void acaoGerenciar(int botao);
    public void acaoVoltar();
    public void acaoFiltrar(Boolean animacao);
    public void acaoAjuda();
    
    public default boolean sair() { return true; }
    
}