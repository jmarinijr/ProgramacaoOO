/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniritter.exemplos;

/**
 *
 * @author Gordo
 */
public class CifraCesar {
    
    private boolean testaLetra(int ascii){
        if((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122) )
            return true;
        else
            return false;
    }

    public String encripta(String texto, int deslocamento){
        StringBuffer codificado = new StringBuffer();
        int asciiOriginal, asciiCriptografado;
        for(int i=0; i<texto.length(); i++){
            asciiOriginal = (int) texto.charAt(i);
            if(testaLetra(asciiOriginal)) {
                asciiCriptografado = asciiOriginal + deslocamento;
                if(testaLetra(asciiCriptografado))
                    codificado.append((char) asciiCriptografado);
                else
                    codificado.append((char) (asciiCriptografado - 26));
            }
            else
                codificado.append(texto.charAt(i));
        }
        String retorno = new String(codificado);
        return retorno;
    }
}
