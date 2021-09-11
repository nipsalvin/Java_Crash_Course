/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template in the editor.
 */
package cashregisterdrawer;

public class ICashRegisterDrawer {
    
    public DrawerStatus getDrawerStatus();
    public void Open();
    public void Close ();
    public boolean isOpen ();
    public boolean isClosed();
    
}
