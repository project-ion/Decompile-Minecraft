/*  1:   */ import com.google.common.base.Function;
/*  2:   */ 
/*  3:   */ public class amr
/*  4:   */   extends aju
/*  5:   */ {
/*  6:   */   protected final atr b;
/*  7:   */   protected final Function c;
/*  8:   */   
/*  9:   */   public amr(atr paramatr1, atr paramatr2, Function paramFunction)
/* 10:   */   {
/* 11:13 */     super(paramatr1);
/* 12:   */     
/* 13:15 */     this.b = paramatr2;
/* 14:16 */     this.c = paramFunction;
/* 15:   */     
/* 16:18 */     d(0);
/* 17:19 */     a(true);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public amr(atr paramatr1, atr paramatr2, String[] paramArrayOfString)
/* 21:   */   {
/* 22:23 */     this(paramatr1, paramatr2, new ams(paramArrayOfString));
/* 23:   */   }
/* 24:   */   
/* 25:   */   public int a(int paramInt)
/* 26:   */   {
/* 27:38 */     return paramInt;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String e_(amj paramamj)
/* 31:   */   {
/* 32:43 */     return super.a() + "." + (String)this.c.apply(paramamj);
/* 33:   */   }
/* 34:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     amr
 * JD-Core Version:    0.7.0.1
 */