/*
 * package ch8;
 * 
 * //����� ���� //����A�� ����B�� �߻����״ٸ�, A�� B�� '���ο���' //Throwable initCause(Throwable
 * cause) - ������ ���ܸ� ���ο��ܷ� ��� //Throwable getCause() - ���ο��ܸ� ��ȯ
 * 
 * class ChainedExceptionEx {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * try { install(); } catch (InstallException e) { // TODO: handle exception
 * e.printStackTrace(); } catch (Exception e) { // TODO: handle exception
 * e.printStackTrace(); } }
 * 
 * static void install() throws InstallException { try { startInstall();
 * copyFiles(); } catch (SpaceException se) { // TODO: handle exception
 * InstallException ie = new InstallException("��ġ �� ���ܹ߻�"); ie.initCause(se);
 * throw ie; } catch (MemoryException me) { // TODO: handle exception
 * InstallException ie = new InstallException("��ġ �� ���� �߻�"); ie.initCause(me);
 * throw ie; } finally { deleteTempFiles(); } }
 * 
 * static void startInstall() throws SpaceException, MemoryException { if
 * (!enoughSpace()) { throw new SpaceException("��ġ�� ������ �����մϴ�"); } if
 * (!enoughMemory()) { throw new MemoryException("�޸𸮰� �����մϴ�"); } }
 * 
 * static void copyFiles() { ���ϵ��� �����ϴ� �ڵ带 ���´� }
 * 
 * static void deleteTempFiles() { �ӽ����ϵ��� �����ϴ� �ڵ带 ���´� }
 * 
 * static boolean enoughSpace() { // ��ġ�ϴµ� �ʿ��� ������ �ִ��� Ȯ�� return false; }
 * 
 * static boolean enoughMemory() { // ��ġ�ϴµ� �ʿ��� �޸𸮰����� �ִ��� Ȯ�� return true; }
 * 
 * }
 * 
 * class InstallException extends Exception { InstallException(String msg) {
 * super(msg); } }
 * 
 * class SpaceException extends Exception { SpaceException(String msg) {
 * super(msg); } }
 * 
 * class MemoryException extends Exception { MemoryException(String msg) {
 * super(msg); } }
 */