/*  1:   */ import java.util.Arrays;
/*  2:   */ 
/*  3:   */ public class cja
/*  4:   */   extends arj
/*  5:   */ {
/*  6:16 */   private static final bec f = aty.a.P();
/*  7:   */   private final dt g;
/*  8:   */   private int[] h;
/*  9:   */   private bec[] i;
/* 10:   */   
/* 11:   */   public cja(aqu paramaqu, dt paramdt1, dt paramdt2, int paramInt)
/* 12:   */   {
/* 13:26 */     super(paramaqu, paramdt1, paramdt2, paramInt);
/* 14:27 */     this.g = paramdt1.b(new fd(paramInt, paramInt, paramInt));
/* 15:   */     
/* 16:29 */     int j = 8000;
/* 17:30 */     this.h = new int[8000];
/* 18:31 */     Arrays.fill(this.h, -1);
/* 19:32 */     this.i = new bec[8000];
/* 20:   */   }
/* 21:   */   
/* 22:   */   public bcm s(dt paramdt)
/* 23:   */   {
/* 24:38 */     int j = (paramdt.n() >> 4) - this.a;
/* 25:39 */     int k = (paramdt.p() >> 4) - this.b;
/* 26:   */     
/* 27:41 */     return this.c[j][k].a(paramdt, bfl.b);
/* 28:   */   }
/* 29:   */   
/* 30:   */   public int b(dt paramdt, int paramInt)
/* 31:   */   {
/* 32:46 */     int j = e(paramdt);
/* 33:47 */     int k = this.h[j];
/* 34:48 */     if (k == -1)
/* 35:   */     {
/* 36:49 */       k = super.b(paramdt, paramInt);
/* 37:50 */       this.h[j] = k;
/* 38:   */     }
/* 39:52 */     return k;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public bec p(dt paramdt)
/* 43:   */   {
/* 44:57 */     int j = e(paramdt);
/* 45:58 */     bec localbec = this.i[j];
/* 46:59 */     if (localbec == null)
/* 47:   */     {
/* 48:60 */       localbec = c(paramdt);
/* 49:61 */       this.i[j] = localbec;
/* 50:   */     }
/* 51:63 */     return localbec;
/* 52:   */   }
/* 53:   */   
/* 54:   */   private bec c(dt paramdt)
/* 55:   */   {
/* 56:67 */     if ((paramdt.o() >= 0) && (paramdt.o() < 256))
/* 57:   */     {
/* 58:68 */       int j = (paramdt.n() >> 4) - this.a;
/* 59:69 */       int k = (paramdt.p() >> 4) - this.b;
/* 60:   */       
/* 61:71 */       return this.c[j][k].g(paramdt);
/* 62:   */     }
/* 63:74 */     return f;
/* 64:   */   }
/* 65:   */   
/* 66:   */   private int e(dt paramdt)
/* 67:   */   {
/* 68:78 */     int j = paramdt.n() - this.g.n();
/* 69:79 */     int k = paramdt.o() - this.g.o();
/* 70:80 */     int m = paramdt.p() - this.g.p();
/* 71:81 */     return j * 400 + m * 20 + k;
/* 72:   */   }
/* 73:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cja
 * JD-Core Version:    0.7.0.1
 */