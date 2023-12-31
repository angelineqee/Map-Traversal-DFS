import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class MainFrame extends javax.swing.JFrame {

    Vertex source = null;
    Vertex destination = null; 
    static final int vertexNum = 13;
    static Vertex [] vertices = new Vertex[vertexNum]; //stores all the locations
    FindPathDFS obj = new FindPathDFS(); //To use the FindPath() function in FindPathDFS.java

    String start = " ";
    String end = " ";

    /**
     * Creates new form MainFrame
     */
    public MainFrame() 
    {
        initComponents();
        
        Icon i = label.getIcon();
        ImageIcon icon = (ImageIcon) i;
        Image image = icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon (image));
    }

    //Initialize GUI components
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Path = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Origin = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Destination = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        SearchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("USM Navigation");
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 252, 249));

        Path.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Path.setForeground(new java.awt.Color(105, 71, 64));
        Path.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Path.setText("Path");
        Path.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jScrollPane1.setViewportView(Path);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)				  
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 252, 249));

        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("212.png"))); // NOI18N
        label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel3.setBackground(new java.awt.Color(201, 192, 180));

        Header.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        Header.setForeground(new java.awt.Color(255, 252, 249));
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setText("Welcome to USM Main Campus");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)					  
                .addComponent(Header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)	
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Header)
                .addGap(31, 31, 31))
        );

        jPanel4.setBackground(new java.awt.Color(255, 252, 249));

        Origin.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Origin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masjid", "CS School", "Fajar", "Eureka", "DTSP", "Library", "Padang Kawad", "Sg. Dua Gate", "Subaidah", "Bukit Gambir Gate", "Swimming Pool", "RST", "Minden Gate" }));
        Origin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Origin.setMaximumSize(new java.awt.Dimension(157, 25));
        Origin.setMinimumSize(new java.awt.Dimension(157, 25));
        Origin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OriginActionPerformed(evt);
            }
        });
        ItemListener itemListener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    Origin = (JComboBox) e.getSource();
                    start = Origin.getSelectedItem().toString();
                }
            }
        };
        Origin.addItemListener(itemListener);


        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(105, 71, 64));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Origin");

        Destination.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masjid", "CS School", "Fajar", "Eureka", "DTSP", 
        "Library", "Padang Kawad", "Sg. Dua Gate", "Subaidah", "Bukit Gambir Gate", "Swimming Pool", "RST", "Minden Gate" }));
        Destination.setMaximumSize(new java.awt.Dimension(157, 25));
        Destination.setMinimumSize(new java.awt.Dimension(157, 25));
        Destination.setPreferredSize(new java.awt.Dimension(157, 25));
        Destination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinationActionPerformed(evt);
            }
        });
        ItemListener itemListener2 = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    Destination = (JComboBox) e.getSource();
                    end = Destination.getSelectedItem().toString();
                }
            }
        };
        Destination.addItemListener(itemListener2);

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(105, 71, 64));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Destination");

        SearchButton.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        SearchButton.setForeground(new java.awt.Color(105, 71, 64));
        SearchButton.setText("Search route");
        SearchButton.setAutoscrolls(true);
        SearchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SearchButton.setMaximumSize(new java.awt.Dimension(109, 27));
        SearchButton.setMinimumSize(new java.awt.Dimension(109, 27));
        SearchButton.setName(""); // NOI18N
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Origin, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Destination, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Origin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(Destination, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jLabel2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>                        

    private void OriginActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
    }          

    private void DestinationActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           

    //When the search button is clicked
    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        start = Origin.getSelectedItem().toString(); //get the start location selected by the user
        end = Destination.getSelectedItem().toString(); //get the end location selected by the user
        if (start.equals(end)) //if the start and end locations are the same, display an error message with a message dialog
        {   ImageIcon icon = new ImageIcon("C:/Users/Juyiillee/Downloads/CPT212_ass2/src/uhoh.jpg");
            Image image = icon.getImage(); // transform it 
            Image newimg = image.getScaledInstance(300, 220,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
            icon = new ImageIcon(newimg);  // transform it back
            
            Font newFont = new Font("Serif", Font.BOLD, 14); 
            Color fontColour = Color.decode("#694740"); 
            UIManager.put("OptionPane.messageFont", newFont);
            UIManager.put("OptionPane.messageForeground", fontColour);            
            
            JOptionPane.showMessageDialog(null, "Origin and destination cannot be the same!", 
            "Uh oh", JOptionPane.ERROR_MESSAGE, icon);
        } 
        else
        {
            for (int i=0; i<vertexNum; i++) //find the start and end vertices from the vertices array
            {
                if (vertices[i].getName().equals(start)){
                    source = vertices[i];
                } 
                else if (vertices[i].getName().equals(end))
                {
                    destination = vertices[i];
                }     
            }                             
            obj.FindPath(source, destination, vertices); //Find path from start vertex to end vertex
            Path.setText(obj.getPath()); //Display the path found
        }
        
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     
        ImageIcon icon = new ImageIcon("C:/Users/Juyiillee/Downloads/CPT212_ass2/src/icon.png");
        setIconImage(icon.getImage());
    }      

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true); //display application frame
            }
        });

        //Initialize all vertices on the graph
        String [] locations = {"Masjid", "CS School","Fajar","Eureka","DTSP","Library","Padang Kawad","Sg. Dua Gate","Subaidah",
        "Bukit Gambir Gate","Swimming Pool","RST","Minden Gate"};
        for (int i=0; i<vertexNum; i++)
        {
            vertices[i] = new Vertex(i,locations[i]);
        }

        //Build the adjacency list for each vertex
        vertices[0].addNeighbour(vertices[1]);
        vertices[0].addNeighbour(vertices[5]);
        vertices[0].addNeighbour(vertices[3]);
        vertices[0].addNeighbour(vertices[4]);
        vertices[0].addNeighbour(vertices[2]);

        vertices[1].addNeighbour(vertices[0]);
        vertices[1].addNeighbour(vertices[6]);

        vertices[2].addNeighbour(vertices[0]);
        vertices[2].addNeighbour(vertices[6]);

        vertices[3].addNeighbour(vertices[0]);
        vertices[3].addNeighbour(vertices[7]);

        vertices[4].addNeighbour(vertices[0]);
        vertices[4].addNeighbour(vertices[8]);

        vertices[5].addNeighbour(vertices[0]);

        vertices[6].addNeighbour(vertices[1]);
        vertices[6].addNeighbour(vertices[9]);
        vertices[6].addNeighbour(vertices[2]);

        vertices[7].addNeighbour(vertices[3]);

        vertices[8].addNeighbour(vertices[4]);
        vertices[8].addNeighbour(vertices[10]);

        vertices[9].addNeighbour(vertices[6]);
        vertices[9].addNeighbour(vertices[11]);

        vertices[10].addNeighbour(vertices[8]);
        vertices[10].addNeighbour(vertices[12]);

        vertices[11].addNeighbour(vertices[9]);

        vertices[12].addNeighbour(vertices[10]);

    }

    //GUI components declaration                    
    private javax.swing.JComboBox<String> Destination;
    private javax.swing.JLabel Header;
    private javax.swing.JComboBox<String> Origin;
    private javax.swing.JLabel Path;
    private javax.swing.JButton SearchButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    // End of variables declaration                   
}
