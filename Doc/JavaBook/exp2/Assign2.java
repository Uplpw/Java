class Assign2{
   public static void main(String[] args){
      MyPoint start=new MyPoint();
      start.x=10;
      start.y=10;
      start.show(start.x,start.y);
      MyPoint end=new MyPoint();
      end.x=20;
      end.y=10;
      end.show(end.x,end.y);
      MyPoint stray=new MyPoint();
      stray=end;
      stray.show(stray.x,stray.y);
      end.show(end.x,end.y);
      start.x=100;
      start.y=100;
      start.show(start.x,start.y);
}
}