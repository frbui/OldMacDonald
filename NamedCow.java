class NamedCow extends Cow
{     
	private String blah;
	public NamedCow(String type, String name, String sound)   
    {
    	myType = type;
    	blah = name;
    	mySound = sound;
    }
    public NamedCow(){
    	blah = "Unknown";
    }
    public String getName(){return blah;}
}
