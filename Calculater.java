import javax.swing.*;
//import java.awt.*;
//import java.util.ArrayList;

public class Calculater extends javax.swing.JFrame {
    public Calculater() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Monitor = new javax.swing.JTextField();
        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnTavan = new javax.swing.JButton();
        btnRadikal = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Monitor.setEditable(false);
        Monitor.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Monitor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Monitor.setText("0.0");
        Monitor.setBorder(new javax.swing.border.MatteBorder(null));

        btnOne.setBackground(new java.awt.Color(255, 0, 0));
        btnOne.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnOne.setForeground(new java.awt.Color(255, 255, 255));
        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });

        btnTwo.setBackground(new java.awt.Color(255, 0, 0));
        btnTwo.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnTwo.setForeground(new java.awt.Color(255, 255, 255));
        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });

        btnThree.setBackground(new java.awt.Color(255, 0, 0));
        btnThree.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnThree.setForeground(new java.awt.Color(255, 255, 255));
        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });

        btnFour.setBackground(new java.awt.Color(255, 0, 0));
        btnFour.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnFour.setForeground(new java.awt.Color(255, 255, 255));
        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });

        btnFive.setBackground(new java.awt.Color(255, 0, 0));
        btnFive.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnFive.setForeground(new java.awt.Color(255, 255, 255));
        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });

        btnSix.setBackground(new java.awt.Color(255, 0, 0));
        btnSix.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnSix.setForeground(new java.awt.Color(255, 255, 255));
        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });

        btnSeven.setBackground(new java.awt.Color(255, 0, 0));
        btnSeven.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnSeven.setForeground(new java.awt.Color(255, 255, 255));
        btnSeven.setText("7");
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });

        btnEight.setBackground(new java.awt.Color(255, 0, 0));
        btnEight.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnEight.setForeground(new java.awt.Color(255, 255, 255));
        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });

        btnNine.setBackground(new java.awt.Color(255, 0, 0));
        btnNine.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnNine.setForeground(new java.awt.Color(255, 255, 255));
        btnNine.setText("9");
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });

        btnZero.setBackground(new java.awt.Color(255, 255, 255));
        btnZero.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnZero.setForeground(new java.awt.Color(255, 0, 0));
        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnEquals.setBackground(new java.awt.Color(255, 255, 255));
        btnEquals.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnEquals.setForeground(new java.awt.Color(255, 0, 0));
        btnEquals.setText("=");
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 0, 0));
        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnMinus.setBackground(new java.awt.Color(255, 255, 255));
        btnMinus.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnMinus.setForeground(new java.awt.Color(255, 0, 0));
        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnMultiply.setBackground(new java.awt.Color(255, 255, 255));
        btnMultiply.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnMultiply.setForeground(new java.awt.Color(255, 0, 0));
        btnMultiply.setText("×");
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });

        btnDivide.setBackground(new java.awt.Color(255, 255, 255));
        btnDivide.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnDivide.setForeground(new java.awt.Color(255, 0, 0));
        btnDivide.setText("÷");
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 0, 0));
        btnClear.setText("c");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnTavan.setBackground(new java.awt.Color(255, 255, 255));
        btnTavan.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnTavan.setForeground(new java.awt.Color(255, 0, 0));
        btnTavan.setText("^");
        btnTavan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTavanActionPerformed(evt);
            }
        });

        btnRadikal.setBackground(new java.awt.Color(255, 255, 255));
        btnRadikal.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnRadikal.setForeground(new java.awt.Color(255, 0, 0));
        btnRadikal.setText("r");
        btnRadikal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadikalActionPerformed(evt);
            }
        });

        btnDot.setBackground(new java.awt.Color(255, 255, 255));
        btnDot.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnDot.setForeground(new java.awt.Color(255, 0, 0));
        btnDot.setText(".");
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnZero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEquals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOne)
                            .addComponent(btnFour)
                            .addComponent(btnSeven))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTwo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFive)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEight)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClear)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTavan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRadikal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMultiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 13, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Monitor)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Monitor, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMultiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMinus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTavan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZero)
                    .addComponent(btnEquals)
                    .addComponent(btnRadikal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        calcute(btnOne);
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        calcute(btnTwo);
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        calcute(btnThree);
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        calcute(btnFour);
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        calcute(btnFive);
    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        calcute(btnSix);
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        calcute(btnSeven);
    }//GEN-LAST:event_btnSevenActionPerformed

    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        calcute(btnEight);
    }//GEN-LAST:event_btnEightActionPerformed

    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        calcute(btnNine);
    }//GEN-LAST:event_btnNineActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        calcute(btnZero);
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
        calcute(btnEquals);
    }//GEN-LAST:event_btnEqualsActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        calcute(btnAdd);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        calcute(btnMinus);
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplyActionPerformed
        calcute(btnMultiply);
    }//GEN-LAST:event_btnMultiplyActionPerformed

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
        calcute(btnDivide);
    }//GEN-LAST:event_btnDivideActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        calcute(btnClear);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnTavanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTavanActionPerformed
        calcute(btnTavan);
    }//GEN-LAST:event_btnTavanActionPerformed

    private void btnRadikalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadikalActionPerformed
        calcute(btnRadikal);
    }//GEN-LAST:event_btnRadikalActionPerformed

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
        calcute(btnDot);
    }//GEN-LAST:event_btnDotActionPerformed

    private double number1;
    private double number2;
    private String op = "";
    private double result;
    
    private void calcute(JButton btn){
        //Button numbers events
        //One
        if(btn == btnOne){
            if(Monitor.getText().equals("0.0")){
                Monitor.setText(btn.getText());
            }else{
                Monitor.setText(Monitor.getText()+btn.getText());
            }
        }
        //Two
        else if(btn == btnTwo){
            if(Monitor.getText().equals("0.0")){
                Monitor.setText(btn.getText());
            }else{
                Monitor.setText(Monitor.getText()+btn.getText());
            }
        }
        //Three
        else if(btn == btnThree){
            if(Monitor.getText().equals("0.0")){
                Monitor.setText(btn.getText());
            }else{
                Monitor.setText(Monitor.getText()+btn.getText());
            }
        }
        //Four
        else if(btn == btnFour){
            if(Monitor.getText().equals("0.0")){
                Monitor.setText(btn.getText());
            }else{
                Monitor.setText(Monitor.getText()+btn.getText());
            }
        }
        //Five
        else if(btn == btnFive){
            if(Monitor.getText().equals("0.0")){
                Monitor.setText(btn.getText());
            }else{
                Monitor.setText(Monitor.getText()+btn.getText());
            }
        }
        //Six
        else if(btn == btnSix){
            if(Monitor.getText().equals("0.0")){
                Monitor.setText(btn.getText());
            }else{
                Monitor.setText(Monitor.getText()+btn.getText());
            }
        }
        //Seven
        else if(btn == btnSeven){
            if(Monitor.getText().equals("0.0")){
                Monitor.setText(btn.getText());
            }else{
                Monitor.setText(Monitor.getText()+btn.getText());
            }
        }
        //Eight
        else if(btn == btnEight){
            if(Monitor.getText().equals("0.0")){
                Monitor.setText(btn.getText());
            }else{
                Monitor.setText(Monitor.getText()+btn.getText());
            }
        }
        //Nine
        else if(btn == btnNine){
            if(Monitor.getText().equals("0.0")){
                Monitor.setText(btn.getText());
            }else{
                Monitor.setText(Monitor.getText()+btn.getText());
            }
        }
        //Zero
        else if(btn == btnZero){
            if(Monitor.getText().equals("0.0")){
                Monitor.setText(btn.getText());
            }else{
                Monitor.setText(Monitor.getText()+btn.getText());
            }
        }
        //Add
        else if(btn == btnAdd){
            if(Monitor.getText().equals("0.0")){
                
            }else{
                number1 = Double.parseDouble(Monitor.getText());
                if(op == "")
                    op = "+";
                Monitor.setText("");
            }
        }
        //Minus
        else if(btn == btnMinus){
            if(Monitor.getText().equals("0.0")){
                
            }else{
                number1 = Double.parseDouble(Monitor.getText());
                if(op == "")
                    op = "-";
                Monitor.setText("");
            }
        }
        //Multiply
        else if(btn == btnMultiply){
            if(Monitor.getText().equals("0.0")){
                
            }else{
                number1 = Double.parseDouble(Monitor.getText());
                if(op == "")
                    op = "*";
                Monitor.setText("");
            }
        }
        //Divide
        else if(btn == btnDivide){
            if(Monitor.getText().equals("0.0")){
                
            }else{
                number1 = Double.parseDouble(Monitor.getText());
                if(op == "")
                    op = "/";
                Monitor.setText("");
            }
        }
        //Radikal
        else if(btn == btnRadikal){
            if(Monitor.getText().equals("0.0")){
                
            }else{
                number1 = Double.parseDouble(Monitor.getText());
                if(op == "")
                    op = "R";
                
            }
        }
        //Tavan
        else if(btn == btnTavan){
            if(Monitor.getText().equals("0.0")){
                
            }else{
                number1 = Double.parseDouble(Monitor.getText());
                if(op == "")
                    op = "^";
                Monitor.setText("");
            }
        }
        //Equals
        else if(btn == btnEquals){
            if(Monitor.getText() == ""){
                
            }else{
                try{
                    number2 = Double.parseDouble(Monitor.getText());
                }catch(Exception ex){
                    
                }
                
                switch(op){
                    case("+"):
                        result = number1 + number2;
                        break;
                    
                    case("-"):
                        result = number1 - number2;
                        break;
                        
                    case("*"):
                        result = number1 * number2;
                        break;
                        
                    case("/"):
                        result = number1 / number2;
                        break;
                        
                    case("R"):
                        result = Math.sqrt(number1);
                        break;
                        
                    case("^"):
                        result = Math.pow(number1, number2);
                }
            }
            Monitor.setText(String.valueOf(result));
        }
        //Clear
        else if(btn == btnClear){
            number1 = 0;
            op = "";
            Monitor.setText("0.0");
        }
        //Dot
        else if(btn == btnDot){
            if(Monitor.getText() == "0.0" || Monitor.getText() == "" || Monitor.getText().endsWith(".0")){
                
            }
            else{
                Monitor.setText(Monitor.getText()+".");
            }
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculater().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Monitor;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnRadikal;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnTavan;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    // End of variables declaration//GEN-END:variables
}
