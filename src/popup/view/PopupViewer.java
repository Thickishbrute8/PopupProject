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
	public String collectResponse(String question)
	{
		String response = "";
		
		response = JOptionPane.showInputDialog(null, question);
		
		return response;
	}
	
	/**
	 * creates a popup to ask a yes/no/cancel type question.
	 * @param question The question being asked the user.
	 * @return The constant value from JOptionPane for y/n/c.
	 */
	public in collectUseroption(String question)
	{
		
		int response = 0;
		
		response = JOptionPane.showConfirmDialog(null, question);
		
		return response;
	}
}
