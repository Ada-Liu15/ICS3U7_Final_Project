import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


class viewf extends JFrame implements ActionListener{
    viewf(String folder){
        setLayout(null);
        String pathForFile = "storedInformation\\";
        String folderName = folder;
        try{
            String fileNameName = pathForFile + folderName + "\\name.txt";
            String fileNameContact = pathForFile + folderName + "\\contact.txt";
            String fileNameAddress = pathForFile + folderName + "\\address.txt";
            String fileNameCity = pathForFile + folderName + "\\city.txt";
            String fileNameProvince = pathForFile + folderName + "\\province.txt";
            String fileNamePostalCode = pathForFile + folderName + "\\postalCode.txt";
            String fileNameHealthNum = pathForFile + folderName + "\\healthNumber.txt";
            String fileNameNotes = pathForFile + folderName + "\\note.txt";

            BufferedReader patientInfoReaderName = new BufferedReader(new FileReader(fileNameName));
            BufferedReader patientInfoReaderContact = new BufferedReader(new FileReader(fileNameContact));
            BufferedReader patientInfoReaderAddress = new BufferedReader(new FileReader(fileNameAddress));
            BufferedReader patientInfoReaderCity = new BufferedReader(new FileReader(fileNameCity));
            BufferedReader patientInfoReaderProvince = new BufferedReader(new FileReader(fileNameProvince));
            BufferedReader patientInfoReaderPostalCode = new BufferedReader(new FileReader(fileNamePostalCode));
            BufferedReader patientInfoReaderHealthNum = new BufferedReader(new FileReader(fileNameHealthNum));
            BufferedReader patientInfoReaderNotes = new BufferedReader(new FileReader(fileNameNotes));

            String firstname = patientInfoReaderName.readLine();
            String lastname = patientInfoReaderName.readLine();
            String phone = patientInfoReaderContact.readLine();
            String address = patientInfoReaderAddress.readLine();
            String city = patientInfoReaderCity.readLine();
            String province = patientInfoReaderProvince.readLine();
            String postal = patientInfoReaderPostalCode.readLine();
            String healthnum = patientInfoReaderHealthNum.readLine();

            String line;
            ArrayList<String> al = new ArrayList<>();
            while ((line = patientInfoReaderNotes.readLine()) != null) {
                al.add(line);
            }
            String[] notes = al.toArray(new String[0]);

            add(new CustomLabel(firstname+" "+lastname+" - "+phone+", "+healthnum,30, 70,500, 30));
            add(new CustomLabel(address+", "+city+", "+province+", "+postal,30, 90,500, 30));
            add(new CustomLabel("notes:",30,130,100,30));
            for(int i = 0; i < notes.length;i++){
                add(new CustomLabel(notes[i],30,150+i*15,800,30));
            }

            patientInfoReaderAddress.close();
            patientInfoReaderCity.close();
            patientInfoReaderContact.close();
            patientInfoReaderHealthNum.close();
            patientInfoReaderName.close();
            patientInfoReaderNotes.close();
            patientInfoReaderPostalCode.close();
            patientInfoReaderProvince.close();







        }
        catch(IOException ex){
            System.out.println("There was an issue reading the file");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
