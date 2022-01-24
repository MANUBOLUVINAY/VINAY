package LOckedMe.project;
import java.io.File;

import java.io.IOException;
import java.util.Scanner;


class FileOperation
{
	 static int choice;
	 static int Fchoice;
	 static String location = "C:\\vinay\\project\\final";
	 
	 public static void operation() throws IOException
	 {
		 
		 do 
		 {
			 int choice=0;
			 System.out.println("MAIN MENU");
			 System.out.println("Select the Options Given Below:");
			 System.out.println("1. Retrieve All Files inside Main Folder");
			 System.out.println("2. Perform File Operations");
			 System.out.println("3. Exit\n");
			 Scanner sc = new Scanner(System.in);
				choice= sc.nextInt();
				 switch(choice) 
				 {
				 	case 1:
				 		File Fobj = new File("C:\\vinay\\project\\final");
				 		File fa[] = Fobj.listFiles();
				 		for(int i=0;i<fa.length;i++) 
				 		{
				 			if(fa[i].isFile())
				 			{
				 				System.out.println("File: "+fa[i] +"\n");
				 			}
				 			
				 		}
				 	break;
				 	case 2:
				 		do
				 		{
				 			int count=0;
				 			System.out.print("\u000C");
							System.out.println("**FILE OPERATION SECTION**");
							System.out.println("Select the Options Given Below:");
							System.out.println("1. Add File");
							System.out.println("2. Delete File");
							System.out.println("3. Search File");
							System.out.println("4. Goback to Main Menu");
							//System.out.println("5. Exit\n");
						    Fchoice= sc.nextInt();
							switch(Fchoice) 
							{
								case 1:
									
									System.out.println("Please Enter the File name :");
									String str2 = sc.next();
									File addfile = new File(location+"\\"+str2);
									if(addfile.exists()) 
									{
										System.out.println("Already exits !! Please Enter Again\n");
									}
									else 
									{
										try 
										{
											addfile.createNewFile();
											System.out.println("!!Your file is successfully created!!!\n");
										}catch(IOException e)
										{
											e.printStackTrace();
										}
									}
									
								break;
								case 2:
									//System.out.println(" Delete File ");
									System.out.println("Please Enter the File name to be deleted :");
									String st = sc.next();
									File delFile = new File(location+"\\"+st);
									if(delFile.exists()) 
									{
										delFile.delete();
										System.out.println(delFile+" File is Deleted\n");
									}else 
									{
										System.out.println("!!File not Found!!!\n");
									}
								break;
								case 3:
									System.out.println("Please Enter Name of the File to be searched :");
									st = sc.next();
									File fsearch = new File("C:\\vinay\\project\\final");
									File fsa[] = fsearch.listFiles();
									for(int i=0;i<fsa.length;i++) {
										if(fsa[i].getName().startsWith(st)) {
											count++;
											if(fsa[i].isFile()) {
								    			System.out.println("File is found : "+fsa[i]+"\n\n");
								    		}
								    		
										}    		
									}
									if(count==0)
										System.out.println("File is not found\n");// here we get file not found exception
									break;
								case 4: 
									break;
								/*case 5:
									System.out.println("Thanks for using my application");
									System.exit(1);
									break;*/

								default:
								     System.out.println("*****you enetered Invalid input******");
									
								}

								System.out.println("Press Enter to continue...");
								System.in.read();
								}while(Fchoice!=4);
								break;
				 	case 3:
				 		System.out.println("Thanks for using my application");
				 		System.exit(1);
				 	default:
				 		System.out.println("****you entered Invalid input*****");
				 }  // Switch close
			
		 }while(choice!=3);  // do close
	 } //method close

} // class close
		
		
public class LockedMe {

	public static void main(String[] args) throws IOException {
		
		String str = "vinay"
				+ "";
		String appName = "LockedMe";
		File mFolder =new File("C:\\vinay\\project\\final");
		
		
		System.out.println("Welcome to Virtual Key for Repositories in JAVA\n\n");
		System.out.println("ApplicationName:"+ appName +" developed by "+str);
		
		System.out.println("Press Enter to continue...");
	   System.in.read();
	  
	   //System.out.print("\u000C");
	    
	    FileOperation.operation();
	    
	    
		
		
		

		
		
	}


}







