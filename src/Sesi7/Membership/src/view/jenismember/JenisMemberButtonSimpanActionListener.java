package view.jenismember;

import java.awt.event.*;
import java.util.UUID;
import model.JenisMember;
import dao.JenisMemberDao;

public class JenisMemberButtonSimpanActionListener implements ActionListener {
    private JenisMemberFrame jenisMemberFrame;
    private JenisMemberDao jenisMemberDao;

    public JenisMemberButtonSimpanActionListener(JenisMemberFrame jenisMemberFrame, JenisMemberDao jenisMemberDao) {
        this.jenisMemberFrame = jenisMemberFrame;
        this.jenisMemberDao = jenisMemberDao;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nama = this.jenisMemberFrame.getNama();
        JenisMember jenisMember = new JenisMember();
        jenisMember.setId(UUID.randomUUID().toString());
        jenisMember.setNama(nama);

        this.jenisMemberFrame.addJenisMember(jenisMember);
        this.jenisMemberDao.insert(jenisMember);
    }
}
