package com.gestiontache.controleur;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.gestiontache.dao.Mysqlconnect;
import com.gestiontache.metier.Membre;
import com.gestiontache.metier.Tache;
import com.gestiontache.metier.TacheMembre;


public class ServiceImpl implements ServiceIlocal {
	 public static Connection conn= Mysqlconnect.ConnectDB();
//		Ajouter un membre
	    public static java.sql.Statement st;
	    public static ResultSet rst;
	    public static PreparedStatement pst;
		@Override
		public String ajouter_membre(Membre mb) {
			// TODO Auto-generated method stub
			String req = "insert into tb_membre values('"+mb.getMembreID()+"','"+mb.getMembreNom()+"','"+mb.getMembrePrenom()+"','"+mb.getMembreAdresse()+"','"+mb.getMembreTel()+"','"+mb.getMembreEmail()+"')";  
		  int verif = 0;
	  	   String rep="";
	  	       try {
	  	          st=conn.createStatement();
	  	           verif=st.executeUpdate(req);
	  	           if(verif!=0)
	  	           {
	  	           rep="valider";
	  	           }
		} catch (SQLException e) {
			rep="Erreur de " +e.getMessage();
			// TODO: handle exception
			 
		}
	  	       return rep;
		}
//		Modifier un membre
		@Override
		public String modifier_membre(Membre memb) {
			// TODO Auto-generated method stub
			String req="Update tb_membre set membrenom='"+memb.getMembreNom()+"',membreprenom='"+memb.getMembrePrenom()+"',membreadresse='"+memb.getMembreAdresse()+"',membretel='"+memb.getMembreTel()+"',membreemail='"+memb.getMembreEmail()+"' where idmembre='"+memb.getMembreID()+"'";
		        int verifieM = 0;
		        String  repons="";
		        try
		        {  
		        st=conn.createStatement();
		        verifieM = st.executeUpdate(req);
		        repons="valider";
		        }  
		        catch(SQLException e)
		        {
		        repons="Erreur de:"+e.getMessage(); 
		        System.err.println("Erreur de! "+e.getMessage());
		        }
		        return repons;
		   
		}
//		Rechercher un membre
		@Override
		public Membre rechercher_membre(int id) {
			// TODO Auto-generated method stub
			Membre memb=new Membre();
			 try {
		            st=conn.createStatement();
		            rst = st.executeQuery("select * from tb_membre where idmembre='"+id+"'");
		            if(rst.next()) {
		            	
		                memb.setMembreID(rst.getInt("idmembre"));
		                memb.setMembreNom(rst.getString("membrenom"));
		                memb.setMembrePrenom(rst.getString("membreprenom"));
		                memb.setMembreAdresse(rst.getString("membreadresse"));
		                memb.setMembreTel(rst.getString("membretel"));
		                memb.setMembreEmail(rst.getString("membreemail"));
		               
		            }
		        } catch (Exception e) {
		        	System.err.println("Erreur de! "+e.getMessage());
		        }
			 
			 return memb;
		}
		@Override
//		Supprimer un membre
		public String supprimer_membre(int id) {
			// TODO Auto-generated method stub
			String rep="";
			try {
			String req ="delete from tb_membre where idmembre='"+id+"'";
                        st=conn.createStatement();
	        st.executeUpdate(req);
	        rep="valider";
	        } catch (SQLException e) {
	        	System.err.println("Erreur de! "+e.getMessage());
	        }
			return rep;
		}
//		Lister tous les membres
         @Override
		public  List<Membre> listemembre() {
			 List<Membre> listm=new ArrayList<>();
			 Membre memb;
			 try {
		            ResultSet rs;
		            st=conn.createStatement();
		            rs = st.executeQuery("select * from tb_membre");
		            while (rs.next() ) {
		            	memb=new Membre(rs.getInt("idmembre"), rs.getString("membrenom"), rs.getString("membreprenom"),
		            			rs.getString("membreadresse"),rs.getString("membretel"),rs.getString("membreemail"));	                
		                listm.add(memb);
		              
		            }
		           
		        } catch (Exception e) {
		            System.err.println("Erreur de! "+e.getMessage());
		        }
			 
			 return listm;
		}
		
		
		@Override
		public String assigner_tache(TacheMembre tachm) {
			// TODO Auto-generated method stub
			//String req = "insert into tb_membretache values(1,'"+mbtache.getIdmembre()+"','"+mbtache.getIdtache()+"')";  
			//System.out.println(mbtache.getIdmembre()+" -  "+mbtache.getIdtache());
        	
			String rek="insert into tb_membretache(membreid,tacheid) values('"+tachm.getIdmembre()+"','"+tachm.getIdtache()+"')";
		  	  int verif = 0;
		  	   String rep="";
		  	       try {
		  	          st=conn.createStatement();
		  	           verif=st.executeUpdate(rek);
		  	           if(verif!=0)
		  	           {
		  	           rep="valider";
		  	           }
			} catch (SQLException e) {
				rep="Erreur de " +e.getMessage();
				// TODO: handle exception
				 
			}
		  	       return rep;
		}
		@Override
		public List<TacheMembre> afficher_tachemembre(int id) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public String ajouter_tache(Tache tache) {
			// TODO Auto-generated method stub
						String req = "insert into tb_tache values('"+tache.getTacheId()+"','"+tache.getTacheNom()+"','"+tache.getTacheDescription()+"','"+tache.getTacheDate_debut()+"','"+tache.getTacheDate_fin()+"','"+tache.getTacheEtat()+"')";  
				
				  	  int verif = 0;
				  	   String rep="";
				  	       try {
				  	          st=conn.createStatement();
				  	           verif=st.executeUpdate(req);
				  	           if(verif!=0)
				  	           {
				  	           rep="valider";
				  	           }
					} catch (SQLException e) {
						rep="Erreur de " +e.getMessage();
						// TODO: handle exception
						 
					}
				  	       return rep;
		}
		
		@Override
		public String modifier_tache(Tache tache) {
			// TODO Auto-generated method stub
						String req="Update tb_tache set tachenom='"+tache.getTacheNom()+"',tachedescription='"+tache.getTacheDescription()+"',tachedate_debut='"+tache.getTacheDate_debut()+"',tachedate_fin='"+tache.getTacheDate_fin()+"',tacheetat='"+tache.getTacheEtat()+"' where idtache='"+tache.getTacheId()+"'";
					        int verifieM = 0;
					        String  repons="";
					        try
					        {  
					        st=conn.createStatement();
					        verifieM = st.executeUpdate(req);
					        repons="valider";
					        }  
					        catch(SQLException e)
					        {
					        repons="Erreur de:"+e.getMessage(); 
					        System.err.println("Erreur de! "+e.getMessage());
					        }
					        return repons;
		}
		
		@Override
		public Tache rechercher_tache(int id) {
			// TODO Auto-generated method stub
			Tache tach=new Tache();
			 try {
		            ResultSet rs;
		            st=conn.createStatement();
		            rs = st.executeQuery("select * from tb_tache where idtache='"+id+"'");
		            if(rs.next()) {
		            	
		                tach.setTacheId(rs.getInt("idtache"));
		                tach.setTacheNom(rs.getString("tachenom"));
		                tach.setTacheDescription(rs.getString("tachedescription"));
		                tach.setTacheDate_debut(rs.getString("tachedate_debut"));
		                tach.setTacheDate_fin(rs.getString("tachedate_fin"));
		                tach.setTacheEtat(rs.getString("tacheetat"));
		               
		            }
		        } catch (SQLException e) {
		        	System.err.println("Erreur de! "+e.getMessage());
		        }
			 
			 return tach;
		}
		@Override
		public String supprimer_tache(int id) {
			// TODO Auto-generated method stub
						String rep="";
						try {
						String req ="delete from tb_tache where idtache='"+id+"'";
				        st.executeUpdate(req);
				        rep="valider";
				        } catch (SQLException e) {
				        	System.err.println("Erreur de! "+e.getMessage());
				        }
						return rep;
		}
		public List<Tache> listetache()
		{
			 List<Tache> listtach=new ArrayList<>();
			 Tache tach=new Tache();
			 try {
		            ResultSet rs;
		            st=conn.createStatement();
		            rs = st.executeQuery("select * from tb_tache");
		           	 while (rs.next() ) {
		           		tach=new Tache(rs.getInt("idtache"), rs.getString("tachenom"), rs.getString("tachedescription"),
				            			rs.getString("tachedate_debut"),rs.getString("tachedate_fin"),rs.getString("tacheetat"));	                
				                
		                listtach.add(tach);
		            	}
		        } catch (SQLException e) {
		            System.err.println("Erreur de! "+e.getMessage());
		        }
			 
			 return listtach;
		}
	
      

}
