/*   1:    */ import com.google.common.util.concurrent.FutureCallback;
/*   2:    */ import com.google.common.util.concurrent.SettableFuture;
/*   3:    */ import java.io.File;
/*   4:    */ 
/*   5:    */ class cvr
/*   6:    */   implements FutureCallback
/*   7:    */ {
/*   8:    */   cvr(cvo paramcvo, File paramFile, SettableFuture paramSettableFuture) {}
/*   9:    */   
/*  10:    */   public void onSuccess(Object paramObject)
/*  11:    */   {
/*  12:200 */     this.c.a(this.a);
/*  13:201 */     this.b.set(null);
/*  14:    */   }
/*  15:    */   
/*  16:    */   public void onFailure(Throwable paramThrowable)
/*  17:    */   {
/*  18:206 */     this.b.setException(paramThrowable);
/*  19:    */   }
/*  20:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cvr
 * JD-Core Version:    0.7.0.1
 */