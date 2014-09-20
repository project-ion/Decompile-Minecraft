/*  1:   */ public class bu
/*  2:   */   extends z
/*  3:   */ {
/*  4:   */   public String c()
/*  5:   */   {
/*  6:12 */     return "kill";
/*  7:   */   }
/*  8:   */   
/*  9:   */   public int a()
/* 10:   */   {
/* 11:17 */     return 2;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public String c(ae paramae)
/* 15:   */   {
/* 16:22 */     return "commands.kill.usage";
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(ae paramae, String[] paramArrayOfString)
/* 20:   */   {
/* 21:27 */     if (paramArrayOfString.length == 0)
/* 22:   */     {
/* 23:28 */       localObject = b(paramae);
/* 24:29 */       ((ahd)localObject).G();
/* 25:30 */       a(paramae, this, "commands.kill.successful", new Object[] { ((ahd)localObject).e_() });
/* 26:31 */       return;
/* 27:   */     }
/* 28:34 */     Object localObject = b(paramae, paramArrayOfString[0]);
/* 29:35 */     ((wv)localObject).G();
/* 30:36 */     a(paramae, this, "commands.kill.successful", new Object[] { ((wv)localObject).e_() });
/* 31:   */   }
/* 32:   */   
/* 33:   */   public boolean b(String[] paramArrayOfString, int paramInt)
/* 34:   */   {
/* 35:41 */     return paramInt == 0;
/* 36:   */   }
/* 37:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bu
 * JD-Core Version:    0.7.0.1
 */