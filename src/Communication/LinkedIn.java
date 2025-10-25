package Communication;

public class LinkedIn implements ProfessionalMedia,SocialMedia {

    @Override
    public void searchJobs() {
        System.out.println("Can be used to search jobs");

    }

    @Override
    public void buildResume() {
        System.out.println("It helps to create and update your resume");

    }

    @Override
    public void search(String name) {

    }

    @Override
    public void findfriends(String name) {

    }

    @Override
    public void chat() {

    }
}
