package hipster.controller;

import hipster.view.HipsterFrame;

public class HipsterController
{
	private Hipster firstHipster;
	private HipsterFrame baseFrame;
	
	public HipsterController()
	{
		firstHipster = new Hipster();
		baseFrame = new HipsterFrame(this);
	}
	
	public void start()
	{
		String myName = baseFrame.getResponse("What is your name?");
		firstHipster.setName(myName);
	}

}
