/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Media;

/**
 *
 * @author razvanvc
 */
public class notaMal extends Exception {

        public notaMal() {
            super("Excepción definida por el usuario: Nota no valida.");
        }

        public notaMal(String msg) {
            super("Excepción definida por el usuario: " + msg);
        }
}
