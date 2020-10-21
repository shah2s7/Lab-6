class Tree {
  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;

  Tree() {
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }
  Tree(String aName, String aType, boolean aHasFall, String aColor)
  {
    treeName = aName;
    treeType = aType;
    leavesFall = aHasFall;
    leafColor = aColor;
  }
  void setName(String aName)
  {
    treeName = aName;
  }
  void setType(String aType)
  {
    treeType = aType;
  }
  void setFall(boolean aHasFall)
  {
    leavesFall = aHasFall;
  }
  void setColor(String aColor)
  {
    leafColor = aColor;
  }

  void print() {
  String falls = "";
      if(leavesFall == true)
      {
        falls = "does";
      }
      else
      {
       falls = "does not";
      }
    }

  {
    System.out.println();
    System.out.println("This is a " + treeName + " tree." + "It is a " + treeType + " and its leaves are currently " + leafColor + " It " + leavesFall + " lose its leaves for the winter");
  }
}