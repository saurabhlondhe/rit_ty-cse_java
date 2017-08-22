import java.util.*;
class arraylist
{
		public static void main(String args[])
		{
				ArrayList<String> obj=new ArrayList<String>();
				ArrayList<String> obj1=new ArrayList<String>();
				//add element
				System.out.println("**********************************************");
					System.out.println("\nadd elements in array\n");
					obj.add("saurabh");
					obj.add("ramdas");
					obj.add("londhe");
					obj.add("abc");
					System.out.println(obj);
				
				//remove element
				System.out.println("**********************************************");
					System.out.println("\nremoved elements\n");
					obj.remove(1);
					System.out.println(obj);
				
				//get element
				System.out.println("**********************************************");
					System.out.println("\nretrived elements\n");
					String display=obj.get(0);
					System.out.println(display);
					System.out.println(obj.get(1));
				
				//add with index
				System.out.println("**********************************************");
					System.out.println("\nadd with index\n");
					obj.add(1,"ramdas");
					System.out.println(obj);
				
				//set update element
				System.out.println("**********************************************");
					System.out.println("\nupdated element at '0'\n");
					obj.set(0,"SAURABH");
					System.out.println(obj);
				
				//sort list
				System.out.println("**********************************************");
					System.out.println("\nsort list\n");
					Collections.sort(obj);
					System.out.println(obj);
				
				//search in array list using contains
				System.out.println("**********************************************");
				System.out.println("\nsearch element 'londhe'\n");
				
					if(obj.contains("londhe"))
					{
							System.out.println("\nelement found\n");
					}
					else
					{
							System.out.println("\nelement not found\n");
					}
				
				//reverse array list
				System.out.println("**********************************************");
				System.out.println("\nreverse list\n");
					Collections.reverse(obj);
					System.out.println(obj);
				
				//shuffle
				System.out.println("**********************************************");
				System.out.println("\nshuffle list\n");
					Collections.shuffle(obj);
					System.out.println(obj);
					
				//intersection
				System.out.println("**********************************************");
				System.out.println("\ncommon elements\n");
				ArrayList<String> obj2=new ArrayList<String>();
					for(String e:obj1)
					{
							if(obj.contains(e))
							{
									System.out.println("\tfound\n");
									obj2.add(e);
							}
							else
							{
									System.out.println("\tnot found\n");
							}
					}
					System.out.println(obj2);
				//swap 
				System.out.println("**********************************************");
				System.out.println("\nswap index '1' with '3'\n");
					System.out.println(obj);
					Collections.swap(obj,1,3);
					System.out.println(obj);
				
				//copy array
				System.out.println("**********************************************");
				System.out.println("\ncopy list\n");
				obj1.add("1");
					obj1.add("ramdas");
					obj1.add("3");
					obj1.add("4");
					
					System.out.println(obj1);
					Collections.copy(obj1,obj);
					System.out.println(obj1);
				System.out.println("**********************************************");
					
		}
}
