/*  1:   */ import com.google.common.collect.ImmutableList;
/*  2:   */ import com.google.common.collect.UnmodifiableIterator;
/*  3:   */ import java.util.Random;
/*  4:   */ 
/*  5:   */ public class ayu
/*  6:   */   extends atr
/*  7:   */ {
/*  8:   */   public ayu()
/*  9:   */   {
/* 10:18 */     super(bof.e);
/* 11:19 */     a(akf.b);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public alq a(bec parambec, Random paramRandom, int paramInt)
/* 15:   */   {
/* 16:25 */     if (this == aty.q) {
/* 17:26 */       return amk.h;
/* 18:   */     }
/* 19:28 */     if (this == aty.ag) {
/* 20:29 */       return amk.i;
/* 21:   */     }
/* 22:31 */     if (this == aty.x) {
/* 23:32 */       return amk.aW;
/* 24:   */     }
/* 25:34 */     if (this == aty.bP) {
/* 26:35 */       return amk.bO;
/* 27:   */     }
/* 28:37 */     if (this == aty.co) {
/* 29:38 */       return amk.cg;
/* 30:   */     }
/* 31:40 */     return alq.a(this);
/* 32:   */   }
/* 33:   */   
/* 34:   */   public int a(Random paramRandom)
/* 35:   */   {
/* 36:45 */     if (this == aty.x) {
/* 37:46 */       return 4 + paramRandom.nextInt(5);
/* 38:   */     }
/* 39:48 */     return 1;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public int a(int paramInt, Random paramRandom)
/* 43:   */   {
/* 44:53 */     if ((paramInt > 0) && (alq.a(this) != a((bec)O().a().iterator().next(), paramRandom, paramInt)))
/* 45:   */     {
/* 46:54 */       int i = paramRandom.nextInt(paramInt + 2) - 1;
/* 47:55 */       if (i < 0) {
/* 48:56 */         i = 0;
/* 49:   */       }
/* 50:58 */       return a(paramRandom) * (i + 1);
/* 51:   */     }
/* 52:60 */     return a(paramRandom);
/* 53:   */   }
/* 54:   */   
/* 55:   */   public void a(aqu paramaqu, dt paramdt, bec parambec, float paramFloat, int paramInt)
/* 56:   */   {
/* 57:65 */     super.a(paramaqu, paramdt, parambec, paramFloat, paramInt);
/* 58:68 */     if (a(parambec, paramaqu.s, paramInt) != alq.a(this))
/* 59:   */     {
/* 60:69 */       int i = 0;
/* 61:70 */       if (this == aty.q) {
/* 62:71 */         i = uv.a(paramaqu.s, 0, 2);
/* 63:72 */       } else if (this == aty.ag) {
/* 64:73 */         i = uv.a(paramaqu.s, 3, 7);
/* 65:74 */       } else if (this == aty.bP) {
/* 66:75 */         i = uv.a(paramaqu.s, 3, 7);
/* 67:76 */       } else if (this == aty.x) {
/* 68:77 */         i = uv.a(paramaqu.s, 2, 5);
/* 69:78 */       } else if (this == aty.co) {
/* 70:79 */         i = uv.a(paramaqu.s, 2, 5);
/* 71:   */       }
/* 72:81 */       b(paramaqu, paramdt, i);
/* 73:   */     }
/* 74:   */   }
/* 75:   */   
/* 76:   */   public int j(aqu paramaqu, dt paramdt)
/* 77:   */   {
/* 78:87 */     return 0;
/* 79:   */   }
/* 80:   */   
/* 81:   */   public int a(bec parambec)
/* 82:   */   {
/* 83:93 */     if (this == aty.x) {
/* 84:94 */       return akv.l.b();
/* 85:   */     }
/* 86:96 */     return 0;
/* 87:   */   }
/* 88:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ayu
 * JD-Core Version:    0.7.0.1
 */