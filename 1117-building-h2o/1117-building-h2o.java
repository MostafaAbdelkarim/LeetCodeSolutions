class H2O {
    
    private int hydrogenAtom = 0;
    private final Object lock = new Object();

    public H2O() {}

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
		
        synchronized (lock) {
            while (hydrogenAtom == 2) {
                lock.wait();
            }
            releaseHydrogen.run();
            hydrogenAtom += 1;
            if (hydrogenAtom == 2) {
                lock.notifyAll();
            }
        }
        
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        
        synchronized (lock) {
            
            while (hydrogenAtom < 2) {
                lock.wait();
            }
            releaseOxygen.run();
            hydrogenAtom -= 2;
            lock.notifyAll();
        }
		
    }
}