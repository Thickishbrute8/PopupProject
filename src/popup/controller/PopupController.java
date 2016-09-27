package popup.controller;
import popup.view.PopupViewer;
public class PopupController
{

	private PopupViewer display;
	
	public PopupController()
	{
		display = new PopupViewer();
	}
	public void start()
	{
		String answer = "sample";
		while(answer != null && !answer.equals(""))
		{
			display.displayMessage("Greetings, traveler");
			answer = display.collectResponse("Do you hunt alone?");
			display.displayMessage(answer + " is what you said");
			
			
		}
	}
}
