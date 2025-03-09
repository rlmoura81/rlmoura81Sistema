package br.com.rlmoura81.moura.financeiro;

import br.com.rlmoura81.moura.principalinterface.JPLogin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TipoContaRepository{

    String sql = "";

    public ArrayList getLista() {
        ArrayList tipoconta = new ArrayList();
        try{
            sql = "SELECT cd_tpconta, ds_tpconta " +
                  "  FROM tipoconta";            
            PreparedStatement ps = JPLogin.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();             
            while(rs.next()){
                TipoConta tpc = new TipoConta(
                    rs.getInt("cd_tpconta"),
                    rs.getString("ds_tpconta"));
                    tipoconta.add(tpc);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao carregar a lista de tipo de contas:\n" + 
                    ex.getMessage(), "Tipo de conta", JOptionPane.ERROR_MESSAGE);
        }
        return tipoconta;
    }

    public Object getById(int id) {
        TipoConta tpc = null;
        try{
            sql = "SELECT cd_tpconta, ds_tpconta " +
                  "  FROM tipoconta" +
                  " WHERE cd_tpconta = ?";            
            PreparedStatement ps = JPLogin.conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                tpc = new TipoConta(
                rs.getInt("cd_tpconta"),
                rs.getString("ds_tpconta"));
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro de getById em tipo de contas:\n" + 
                    ex.getMessage(), "Tipo de conta", JOptionPane.ERROR_MESSAGE);
        }
        return tpc;
    }
    
}
