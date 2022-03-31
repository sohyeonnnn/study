/*
 * package ch8;
 * 
 * //연결된 예외 //예외A가 예외B를 발생시켰다면, A를 B의 '원인예외' //Throwable initCause(Throwable
 * cause) - 지정한 예외를 원인예외로 등록 //Throwable getCause() - 원인예외를 반환
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
 * InstallException ie = new InstallException("설치 중 예외발생"); ie.initCause(se);
 * throw ie; } catch (MemoryException me) { // TODO: handle exception
 * InstallException ie = new InstallException("설치 중 예외 발생"); ie.initCause(me);
 * throw ie; } finally { deleteTempFiles(); } }
 * 
 * static void startInstall() throws SpaceException, MemoryException { if
 * (!enoughSpace()) { throw new SpaceException("설치할 공간이 부족합니다"); } if
 * (!enoughMemory()) { throw new MemoryException("메모리가 부족합니다"); } }
 * 
 * static void copyFiles() { 파일들을 복사하는 코드를 적는다 }
 * 
 * static void deleteTempFiles() { 임시파일들을 삭제하는 코드를 적는다 }
 * 
 * static boolean enoughSpace() { // 설치하는데 필요한 공간이 있는지 확인 return false; }
 * 
 * static boolean enoughMemory() { // 설치하는데 필요한 메모리공간이 있는지 확인 return true; }
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