package com.sns.ui;
import java.util.Scanner;

import com.sns.bean.Candidate_Detail;
import com.sns.service.ApplyServiceImp;
import com.sns.service.IApplyService;


public class Candidate {

	public static void main(String[] args) {
				IApplyService service = new ApplyServiceImp();
				
				Scanner sc=new Scanner(System.in);
				
				do {
					System.out.println("*********************Admission System*****************");
					System.out.println("1. Enter Details");
					System.out.println("2. View Details based on Applicant Id");
					System.out.println("3. Exit");
					
					int choice=sc.nextInt();
					
					switch(choice){
					case 1:
						
						System.out.println("Enter Application Id");
						int applyId=sc.nextInt();
						
						sc.nextLine();
						
						
						System.out.println("Enter FirstName");
						String Firstname=sc.nextLine();
						
						System.out.println("Enter LastName");
						String Lastname=sc.nextLine();
						
						System.out.println("Enter ContactNo");
						long ContactNo=sc.nextLong();
						
						sc.nextLine();
						
						System.out.println("Enter Email Id");
						String email=sc.nextLine();
						
						System.out.println("Enter Aggregate");
						double aggregate=sc.nextDouble();
						
						sc.nextLine();
						
						System.out.println("Enter Stream/Course");
						String stream=sc.nextLine();
						
						Candidate_Detail c = new Candidate_Detail();
						c.setApplyId(applyId);
						c.setFirstname(Firstname);
						c.setLastname(Lastname);
						c.setContactNo(ContactNo);
						c.setEmail(email);
						c.setAggregate(aggregate);
						c.setStream(stream);
						
						
						
						
						int num=service.addCandidate_Detail(c);
						if(num>0){
							System.out.println("Candidate Details Inserted");
						}
						else{
							System.out.println("Candidate Details Not Inserted");
						}
						
					break;
					
					
					case 2:
						
						System.out.println("Enter Application Id");
					int applyId1 =sc.nextInt();
				
				
				Candidate_Detail candidate_detail = service.getOneCandidate_Detail(applyId1);
				if(candidate_detail!=null) {
				System.out.println("Sucess");
				System.out.println(candidate_detail);
				
				}else {
					System.out.println("Not Found");
				}
				break;
				
				case 3:
					
					System.out.println("***THANKSYOU FOR APPLYING");
				System.exit(0);
				break;
				
				default:
					break;
			
				
				
				}
				
				
				} while(true);
	}

	}
