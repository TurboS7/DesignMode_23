package principle;

/**
 * 接口隔离原则
 */
public class ISPtest {
    public static void main(String[] args) {
        ModelStudy study = Live.getStudyModel();
        study.read();
        study.write();
        ModelWork work = Live.getWorkModel();
        work.coding();
        work.makeMoney();
        ModelPlay play = Live.getPlayModel();
        play.playGame();
        play.sport();
    }
    /*学习模块*/
    interface ModelStudy{
        void  read();
        void write();
    }
    /*娱乐模式*/
    interface ModelPlay{
        void playGame();
        void sport();
    }
    /*工作模式*/
    interface  ModelWork{
        void makeMoney();
        void coding();
    }

    static class Live implements ModelPlay,ModelStudy,ModelWork{

        public static ModelWork getWorkModel(){
            return (ModelWork) new Live();
        }
        public static ModelPlay getPlayModel(){
            return (ModelPlay) new Live();
        }
        public static ModelStudy getStudyModel(){
            return (ModelStudy) new Live();
        }
        @Override
        public void read() {
            System.out.println("学习模块的read()方法被调用！");
        }

        @Override
        public void write() {
            System.out.println("学习模块的write()方法被调用！");
        }

        @Override
        public void sport() {
            System.out.println("娱乐模块的sport()方法被调用！");
        }

        @Override
        public void playGame() {
            System.out.println("娱乐模块的playGame()方法被调用！");
        }

        @Override
        public void makeMoney() {
            System.out.println("工作模块的makeMoney()方法被调用！");
        }

        @Override
        public void coding() {
            System.out.println("工作模块的coding()方法被调用！");
        }
    }
}
