import lk.manytomany.entity.Lecturer;
import lk.manytomany.entity.Subject;
import lk.manytomany.util.FactoryConfiguaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class AppInitializer {
    public static void main(String[] args) {

        Lecturer l1=new Lecturer();
        l1.setlId("l001");
        l1.setName("Niroth");



        Lecturer l2=  new Lecturer();
        l2.setlId("l002");
        l2.setName("Hasika");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Subject s1 = new Subject();
        s1.setsId("s001");
        s1.setName("PRF");



       Subject s2= new Subject();
        s2.setsId("s002");
        s2.setName("DBMS");
       // step 01
        ArrayList<Subject> subjectList = new ArrayList<>();
        subjectList.add(s1);
        subjectList.add(s2);

        ArrayList <Lecturer> lecturerList=new ArrayList<>();
        lecturerList.add(l1);
        lecturerList.add(l2);



        l1.setSubjectList(subjectList);
        l2.setSubjectList(subjectList);

        s1.setLecturerList(lecturerList);
        s2.setLecturerList(lecturerList);





        Session session = FactoryConfiguaration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(s1);
        session.save(s2);

        session.save(l1);
        session.save(l2);



        transaction.commit();
        session.close();
    }
}
