/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestionparking;

import com.sun.jdi.IntegerValue;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohssine
 */
public class Fenetre extends javax.swing.JFrame {
     ArrayList<Véhicule> Véhicules;
     DefaultListModel modèleListe;
     File fichier;
     FileWriter fw;
     PrintWriter pw;
    /**
     * Creates new form Fenetre
     */
    public Fenetre() {
        initComponents();
        Véhicules = new ArrayList<>();
        modèleListe=new DefaultListModel();
         try {
             fichier= new File("fichier.veh");
             fw= new FileWriter(fichier);
             pw= new PrintWriter(fw);
         } catch (IOException ex) {
          ex.printStackTrace();
         }
        pw=new PrintWriter(fw);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListeVehicule = new javax.swing.JList<>();
        BtnModifier = new javax.swing.JButton();
        BtnAjouter = new javax.swing.JButton();
        BtnSupprimer = new javax.swing.JButton();
        BtnEnregistrer = new javax.swing.JButton();
        BtnFermer = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jScrollPane4.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListeVehicule.setBackground(new java.awt.Color(0, 102, 102));
        ListeVehicule.setBorder(new javax.swing.border.MatteBorder(null));
        ListeVehicule.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        ListeVehicule.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListeVehicule);

        BtnModifier.setBackground(new java.awt.Color(0, 102, 102));
        BtnModifier.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        BtnModifier.setText("Modifier");
        BtnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModifierActionPerformed(evt);
            }
        });

        BtnAjouter.setBackground(new java.awt.Color(0, 102, 102));
        BtnAjouter.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        BtnAjouter.setText("Ajouter");
        BtnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAjouterActionPerformed(evt);
            }
        });

        BtnSupprimer.setBackground(new java.awt.Color(0, 102, 102));
        BtnSupprimer.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        BtnSupprimer.setText("Supprimer");
        BtnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSupprimerActionPerformed(evt);
            }
        });

        BtnEnregistrer.setBackground(new java.awt.Color(0, 102, 102));
        BtnEnregistrer.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        BtnEnregistrer.setText("Enregistrer");
        BtnEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnregistrerActionPerformed(evt);
            }
        });

        BtnFermer.setBackground(new java.awt.Color(0, 102, 102));
        BtnFermer.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        BtnFermer.setText("Fermer");
        BtnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFermerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEnregistrer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnFermer, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnFermer, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFermerActionPerformed
       int choix= JOptionPane.showConfirmDialog(this, "etes vous sur de sortir ?",
        "confirmation", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    
      if(choix==0)  System.exit(0);
    }//GEN-LAST:event_BtnFermerActionPerformed

    private void BtnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAjouterActionPerformed
     Véhicule véhicule =null;
     String marque,modèle,immatriculation,type;
     int nombrePortes,vitesseMax,remourque;
     boolean choix,remorque=true;
     
     type = JOptionPane.showInputDialog(this, "Entere le type du véhicule Voiture/Camion/Moto ",
             "type du véhicule",JOptionPane.PLAIN_MESSAGE);
      if(type==null){
   
      }
     
      else if(type.equalsIgnoreCase("Voiture")){ 
            marque = JOptionPane.showInputDialog(this, "Entere la marque du véhicule ",
             "Marque",JOptionPane.PLAIN_MESSAGE);
            modèle = JOptionPane.showInputDialog(this, "Entere le modèle du véhicule ",
             "Modèle",JOptionPane.PLAIN_MESSAGE);
            immatriculation = JOptionPane.showInputDialog(this, "Entere l'immatriculation du véhicule ",
             "Immatriculation",JOptionPane.PLAIN_MESSAGE);
            nombrePortes =Integer.parseUnsignedInt(JOptionPane.showInputDialog(this, "Entere le nombres des portes","le nombres des portes",JOptionPane.PLAIN_MESSAGE)) ;
             véhicule = new Voiture(marque, modèle, immatriculation, nombrePortes);
            
             
      }
      
      else if(type.equalsIgnoreCase("Moto")) {
            marque = JOptionPane.showInputDialog(this, "Entere la marque du véhicule ",
             "Marque",JOptionPane.PLAIN_MESSAGE);
     modèle = JOptionPane.showInputDialog(this, "Entere le modèle du véhicule ",
             "Modèle",JOptionPane.PLAIN_MESSAGE);
     immatriculation = JOptionPane.showInputDialog(this, "Entere l'immatriculation du véhicule ",
             "Immatriculation",JOptionPane.PLAIN_MESSAGE);
          vitesseMax =Integer.parseUnsignedInt(JOptionPane.showInputDialog(this,
                  "Entrer la vitesse Max","Vitesse Max",JOptionPane.PLAIN_MESSAGE)) ;
          véhicule =new Moto(marque, modèle, immatriculation, vitesseMax);

      }
      else if(type.equalsIgnoreCase("Camion")) {
          
            marque = JOptionPane.showInputDialog(this, "Entere la marque du véhicule ",
             "Marque",JOptionPane.PLAIN_MESSAGE);
            modèle = JOptionPane.showInputDialog(this, "Entere le modèle du véhicule ",
             "Modèle",JOptionPane.PLAIN_MESSAGE);
            immatriculation = JOptionPane.showInputDialog(this, "Entere l'immatriculation du véhicule ",
             "Immatriculation",JOptionPane.PLAIN_MESSAGE);
            remourque= JOptionPane.showConfirmDialog(this, "Le camion a-t-il un remorque", "remorque", JOptionPane.YES_NO_OPTION);
            //0 c-à-d utilisateur est cliquer sur YES
            if (remourque==JOptionPane.YES_OPTION) choix=true;
            else if(remourque==JOptionPane.NO_OPTION) choix=false;        
           véhicule =new Camion(marque, modèle, immatriculation,remorque);
           
      }
      
      else {
         JOptionPane.showMessageDialog(this, "votre choix est incorrect","choix incorrect",JOptionPane.OK_OPTION);
           }
      
       Véhicules.add(véhicule);
       modèleListe.add(modèleListe.getSize(), véhicule);
       ListeVehicule.setModel(modèleListe);
    }//GEN-LAST:event_BtnAjouterActionPerformed

    private void BtnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnregistrerActionPerformed
       for(Véhicule v:Véhicules){
       pw.println(v);
       }
       pw.close();
           
    }//GEN-LAST:event_BtnEnregistrerActionPerformed

    private void BtnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSupprimerActionPerformed
    if(ListeVehicule.isSelectionEmpty()){
       JOptionPane.showMessageDialog(this,"selectionner un véhicule pour le supprimer!","pas de séléction",JOptionPane.ERROR_MESSAGE);
    }
    else{
    int indice=ListeVehicule.getSelectedIndex();
    modèleListe.remove(indice);
    Véhicules.remove(indice);
    }

    }//GEN-LAST:event_BtnSupprimerActionPerformed

    private void BtnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifierActionPerformed
         String marque,modèle,immatriculation;
     int nombrePortes,vitesseMax,remourque;
      if(ListeVehicule.isSelectionEmpty()){
       JOptionPane.showMessageDialog(this,"selectionner un véhicule pour modifier!","pas de séléction",JOptionPane.ERROR_MESSAGE);
                                          }
     else{
          int indice=ListeVehicule.getSelectedIndex();
          Véhicule v=Véhicules.get(indice);
              marque=JOptionPane.showInputDialog(this, "changer la marque", v.getMarque());
          v.setMarque(marque);
              modèle=JOptionPane.showInputDialog(this, "changer le modèle", v.getModele());
          v.setModele(modèle);
              immatriculation=JOptionPane.showInputDialog(this, "changer l'immatriculation", v.getImmatriculation());
          v.setImmatriculation(immatriculation);
          if(v instanceof Voiture){
          nombrePortes=Integer.valueOf( JOptionPane.showInputDialog(this, "changer le nombres de portes", 
                  ((Voiture) v).getnombrePortes()));
          ((Voiture) v).setnombrePortes(nombrePortes);
                                  }
          else if(v instanceof Camion){
            remourque=JOptionPane.showConfirmDialog(this, "Le camion a t-il un remorque", "remorque", JOptionPane.YES_NO_OPTION);
           boolean choix=true;
           if(remourque==JOptionPane.NO_OPTION) choix=false;
            ((Camion) v).setRemourque(choix);
                                      }
          else if(v instanceof Moto){
          vitesseMax=Integer.valueOf( JOptionPane.showInputDialog(this,"changer la vitesse maximal",((Moto) v).getVitesseMax()));
          ((Moto) v).setVitesseMax(vitesseMax);
          }
          else{
          JOptionPane.showMessageDialog(this,"error","error",JOptionPane.ERROR_MESSAGE);
              }
     
                   ListeVehicule.setModel(modèleListe);
      
        }
    }//GEN-LAST:event_BtnModifierActionPerformed

   
    public static void main(String args[]) {
       
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Fenetre f= new Fenetre();
               f.setVisible(true);
               f.setTitle("La Gestion d'un Parking ");
               f.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAjouter;
    private javax.swing.JButton BtnEnregistrer;
    private javax.swing.JButton BtnFermer;
    private javax.swing.JButton BtnModifier;
    private javax.swing.JButton BtnSupprimer;
    private javax.swing.JList<String> ListeVehicule;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
