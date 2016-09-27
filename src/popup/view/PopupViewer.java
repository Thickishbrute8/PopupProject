package popup.view;

import javax.swing.JOptionPane;

public class PopupViewer
{

	/**
	 * Makea popup window to display the supplies mesage
	 * @param message The messagebe placed in the popup
	 */
	public void displayMessage(String message)
	{
 JOptionPane.showMessageDialog(null,  message);
	}
	
	/**
	 * Creates an input popup to collect a response from the user as a String.
	 * @param question the question being asked to the user.
	 * @return The users response.
	 */
	public String collectResponce(String question)
	{
		String responce = "";
		
		responce = JOptionPane.showInputDialog(null, question);
		
		return responce;
	}
}
