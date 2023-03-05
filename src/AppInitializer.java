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



        Lecturer l3=new Lecturer();
        l3.setlId("l003");
        l3.setName("Nisala");



        Lecturer l4=  new Lecturer();
        l4.setlId("l004");
        l4.setName("Chamodya");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Subject s1 = new Subject();
        s1.setsId("s001");
        s1.setName("PRF");



       Subject s2= new Subject();
        s2.setsId("s002");
        s2.setName("DBMS");


        Subject s3 = new Subject();
        s3.setsId("s003");
        s3.setName("Layerd");



        Subject s4= new Subject();
        s4.setsId("s004");
        s4.setName("ORM");

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



        //step 02
        l3.getSubjectList().add(s3);
        l4.getSubjectList().add(s4);


        s3.getLecturerList().add(l3);
        s3.getLecturerList().add(l4);


        Session session = FactoryConfiguaration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(s3);
        session.save(s4);

        session.save(l3);
        session.save(l4);



        transaction.commit();
        session.close();
    }
}
