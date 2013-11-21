class Exercise3{

        public static void main(String[] args){
		int a = 3;
		int b = 3;
		int c = 3;
}
	public static boolean isTriangle(int a, int b, int c){
		if (a>b+c){
			System.out.println("False");
                        return false;
}
		if (b>a+c){
                        System.out.println("False");
                        return false;
}
		if (c>a+b){
			System.out.println("False");
			return false;
		}  else  {
			System.out.println("True");
			return true;
}
}
}


