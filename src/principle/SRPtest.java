package principle;

/**
 * 单一职责原则
 */
public class SRPtest {
    public static void main(String[] args) {
        SchoolWork.liveWork(new LTeacher("123"));
        SchoolWork.studyWork(new STeacher("321"));
    }
    static class SchoolWork{
        static void studyWork(STeacher teacher){
                   teacher.teach();
        }
        static void liveWork(LTeacher teacher){
            teacher.chaqing();
        }
    }
    static class LTeacher{
        private String name;

        public LTeacher(String name) {
            this.name = name;
        }

        public void chaqing(){
            System.out.println("chaqing");
        }

        public void clean(){
            System.out.println("clean");
        }
    }
    static class STeacher{
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public STeacher(String name) {
            this.name = name;
        }

        public void teach(){
            System.out.println("teach");
        }
    }
}
