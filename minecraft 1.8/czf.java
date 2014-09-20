/*   1:    */ import java.util.HashMap;
/*   2:    */ import paulscode.sound.Library;
/*   3:    */ import paulscode.sound.SoundSystem;
/*   4:    */ import paulscode.sound.SoundSystemConfig;
/*   5:    */ import paulscode.sound.Source;
/*   6:    */ 
/*   7:    */ class czf
/*   8:    */   extends SoundSystem
/*   9:    */ {
/*  10:    */   private czf(cza paramcza) {}
/*  11:    */   
/*  12:    */   public boolean playing(String paramString)
/*  13:    */   {
/*  14:455 */     synchronized (SoundSystemConfig.THREAD_SYNC)
/*  15:    */     {
/*  16:456 */       if (this.soundLibrary == null) {
/*  17:457 */         return false;
/*  18:    */       }
/*  19:460 */       Source localSource = (Source)this.soundLibrary.getSources().get(paramString);
/*  20:461 */       if (localSource == null) {
/*  21:462 */         return false;
/*  22:    */       }
/*  23:465 */       return (localSource.playing()) || (localSource.paused()) || (localSource.preLoad);
/*  24:    */     }
/*  25:    */   }
/*  26:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     czf
 * JD-Core Version:    0.7.0.1
 */