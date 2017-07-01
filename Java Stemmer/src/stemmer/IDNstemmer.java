/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stemmer;
/**
 *
 * @author Osama
 */
public class IDNstemmer {
    
    public void IDNstemmer(){}
    
    public String del_prefix(String masukan)
	{
	   // awalan : ber, bel, be, ke, se, te, ter, me, mem, men, meng, menge, pe, pem, pen, peng, penge, pe, pel, per, memper; Sumber : http://tatabahasabm.tripod.com/tata/awalan.htm
            String AW1;
            String keluaran;        
            masukan = masukan.toLowerCase();
	    AW1= masukan.substring(0,3);
		if("memper".equals(AW1))
		{
			keluaran = masukan.substring(6,masukan.length());
		}
		else
		{
			AW1= masukan.substring(0,3); //AK = masukan.substring(0,3);
			if("ber".equals(AW1) || "per".equals(AW1) || "bel".equals(AW1) || "pen".equals(AW1)|| "mem".equals(AW1) || "pem".equals(AW1))
			{
                            if("g".equals(masukan.substring(3,4)))
                            {
                                keluaran = masukan.substring(4,masukan.length());
                            }
                            else
                            {
                                keluaran = masukan.substring(3,masukan.length());
                            }
			}
			else
			{
				AW1= masukan.substring(0,3);
				if("bela".equals(AW1))
				{
					keluaran = masukan.substring(4,masukan.length());
				}
				else
				{
					AW1= masukan.substring(0,2);
					if("di".equals(AW1) )
					{
						keluaran = masukan.substring(2,masukan.length()); 
					}
					else
					{
						AW1= masukan.substring(0,2);
						if("ke".equals(AW1))
						{
							keluaran = masukan.substring(2,masukan.length()); 
						}
						else
						{
							AW1= masukan.substring(0,2);
							if("ku".equals(AW1))
							{
								keluaran = masukan.substring(2,masukan.length()); 
							}
							else
							{
								AW1= masukan.substring(0,3);
								if("kau".equals(AW1))
								{
									keluaran = masukan.substring(3,masukan.length()); 
								}
								else
								{
									AW1= masukan.substring(0,2);
									if("me".equals(AW1))
									{
										AW1= masukan.substring(0,4);
										if("memb".equals(AW1))
										{
											keluaran = masukan.substring(3,masukan.length());
										}
										else
										{
											AW1= masukan.substring(0,4);
											if("mend".equals(AW1) || "menf".equals(AW1) || AW1=="menj")
											{
												keluaran = masukan.substring(3,masukan.length());
											}
											else
											{
												AW1= masukan.substring(0,4);
												if("meny".equals(AW1))
												{
													keluaran = "s"+ masukan.substring(4,masukan.length());
												}
												else
												{
													//AW1= masukan.substring(0,4); 
													if("meng".equals(AW1))
													{
														if("a".equals(masukan.substring(4,5)) || "e".equals(masukan.substring(4,5)) || "g".equals(masukan.substring(4,5)) ||  "i".equals(masukan.substring(4,5)) || "o".equals(masukan.substring(4,5)) || "u".equals(masukan.substring(4,5)))
														{
															keluaran = "k"+ masukan.substring(4,masukan.length());
														}
														else
														{
															keluaran = masukan.substring(4,masukan.length());;
														}
													}
													else
													{
														AW1= masukan.substring(0,3); //System.out.println(substring(3,masukan.length()));
														if("men".equals(AW1))
														{
                                                                                                                    if("u".equals(masukan.substring(3,4)) )
                                                                                                                    {
                                                                                                                        keluaran = "t"+masukan.substring(3,masukan.length());
                                                                                                                    }
                                                                                                                    else
                                                                                                                    {
                                                                                                                        keluaran = masukan.substring(3,masukan.length());
                                                                                                                    }//"t".
														}
                                                                                                                else
														{
															if("l".equals(masukan.substring(2,3)) || "m".equals(masukan.substring(2,3)) || "n".equals(masukan.substring(2,3)) || "r".equals(masukan.substring(2,3)))
															{
																keluaran = masukan.substring(2,masukan.length());
															}
															else
															{
																keluaran = masukan;
															}
														}
                                                                                                                if("mem".equals(AW1))
														{
                                                                                                                    if("i".equals(masukan.substring(3,4)))
															keluaran = "f"+ masukan.substring(3,masukan.length());//"t".
                                                                                                                    if("u".equals(masukan.substring(3,4)))
                                                                                                                        keluaran = "p"+ masukan.substring(3,masukan.length());//"t".
                                                                                                                        
														}
                                                                                                                
													}
                                                                                                        
                                                                                                        
												}
											}
										}
									}
									else
									{
										AW1= masukan.substring(0,2);
										if("pe".equals(AW1))
										{
											keluaran = masukan.substring(2,masukan.length());
										}
										else
										{
											AW1= masukan.substring(0,2);
											if("se".equals(AW1))
											{
												keluaran = masukan.substring(2,masukan.length());
											}
											else
											{
												AW1=masukan.substring(0,3);
												if("ter".equals(AW1))
												{
													keluaran = masukan.substring(3,masukan.length());
												}
												else
												{
												/*
													$AW1=substr($masukan,0,3);
													if($AW1=="eka")
													{
														keluaran = substr($masukan,3,strlen($masukan));
													}
													else
													{
														$AW1=substr($masukan,0,6);
														if($AW1=="ekstra")
														{
															keluaran = substr($masukan,6,strlen($masukan));
														}
														else
														{
															$AW1=substr($masukan,0,3);
															if($AW1=="eks")
															{
																keluaran = substr($masukan,3,strlen($masukan));
															}
															else
															{
																$AW1=substr($masukan,0,5);
																if($AW1=="intra")
																{
																	keluaran = substr($masukan,5,strlen($masukan));
																}
															}
														}
													}*/
													keluaran = masukan;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return keluaran;
	}
    

public String del_suffix(String masukan)
	{
            String AK,keluaran;
            masukan= masukan.toLowerCase();
	    AK = masukan.substring(masukan.length()-3);
            //substr($masukan,(strlen($masukan)-3),3);
	    if("nda".equals(AK) || "kah".equals(AK) || "lah".equals(AK) )
	    {
			keluaran = masukan.substring(0,(masukan.length()-3));
		}
		else
		{
			AK = masukan.substring(masukan.length()-3);
			if("nya".equals(AK))
			{
				keluaran = masukan.substring(0,masukan.length()-3);
			}
			else
			{
				AK = masukan.substring(masukan.length()-3);
				if("kan".equals(AK) && masukan.length()>5)
				{
					keluaran = masukan.substring(0,masukan.length()-3);
				}
				else
				{
					AK = masukan.substring(masukan.length()-2);
					if("an".equals(AK) && masukan.length()>5)
					{
						keluaran = masukan.substring(0,masukan.length()-2);
					}
					else
					{
						AK = masukan.substring(masukan.length()-2);
						if("ku".equals(AK) && masukan.length()>6)
						{
							keluaran = masukan.substring(0,masukan.length()-2);
						}
						else
						{
							AK = masukan.substring(masukan.length()-2);
							if("mu".equals(AK) && masukan.length()>6)
							{
								keluaran = masukan.substring(0,masukan.length()-2);
							}
							else
							{
								AK = masukan.substring(masukan.length()-1);
								if("i".equals(AK))// && masukan.length()>6)
								{
									keluaran = masukan.substring(0,masukan.length()-1);
								}
								else
								{
									keluaran = masukan;
								}
							}
						}
					}
				}
			}
		}
		return keluaran;
	}

public String doStemming(String word)
	{
		String p1 = del_prefix(word);
		String p2 = del_prefix(p1);
		String p3 = del_prefix(p1);
		String s1 = del_suffix(p3);
		String s2 = del_suffix(s1);
		
		return s2;
	}

}