package Design_Patterns.CreationalPatterns.singleton.version1_1;

// version 1.1
public class Singleton {
    /* ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ��� */
    // private static Singleton instance = null;
    /** version 1.4
     * instance = new Singleton()��䣬�Ⲣ����һ��ԭ�Ӳ���,������Ҫ��singleton������ volatile �Ϳ�����
     * ʹ�� volatile ���������ã�
     * 1��������������ڶ���߳��д��ڸ�����ֱ�Ӵ��ڴ��ȡ��
     * 2������ؼ��ֻ��ָֹ���������Ż���Ҳ����˵���� volatile �����ĸ�ֵ�����������һ���ڴ����ϣ����ɵĻ������ϣ������������ᱻ�������ڴ�����֮ǰ��
     */
    private volatile static Singleton instance = null;

    /* ˽�й��췽������ֹ��ʵ���� */
    private Singleton() {
    }

    /* ��̬���̷���������ʵ�� */
    public static Singleton getInstance() {
        /** version 1.3 (˫�ؼ������)
         * ���ʵ���Ѵ���������synchronized����,���ⲻ��Ҫ���߳�ͬ�����������
         */
        if(instance == null) {
            /** version 1.2
             * synchronized�������������ͬ�����е��̣߳������ǲ����̱߳�ɴ��е�һ��һ��ȥnew
             * ֻ��ʵ��δ����ʱ�Żᱻ����
             */
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */
    public Object readResolve() {
        return instance;
    }
}
