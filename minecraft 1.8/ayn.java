/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.List;
/*  3:   */ 
/*  4:   */ public class ayn
/*  5:   */   extends atg
/*  6:   */ {
/*  7:18 */   private static final List a = Lists.newArrayList(new String[] { "harp", "bd", "snare", "hat", "bassattack" });
/*  8:   */   
/*  9:   */   public ayn()
/* 10:   */   {
/* 11:21 */     super(bof.d);
/* 12:22 */     a(akf.d);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/* 16:   */   {
/* 17:27 */     boolean bool = paramaqu.z(paramdt);
/* 18:   */     
/* 19:29 */     bcm localbcm = paramaqu.s(paramdt);
/* 20:30 */     if ((localbcm instanceof bdi))
/* 21:   */     {
/* 22:31 */       bdi localbdi = (bdi)localbcm;
/* 23:32 */       if (localbdi.f != bool)
/* 24:   */       {
/* 25:33 */         if (bool) {
/* 26:34 */           localbdi.a(paramaqu, paramdt);
/* 27:   */         }
/* 28:36 */         localbdi.f = bool;
/* 29:   */       }
/* 30:   */     }
/* 31:   */   }
/* 32:   */   
/* 33:   */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 34:   */   {
/* 35:43 */     if (paramaqu.D) {
/* 36:44 */       return true;
/* 37:   */     }
/* 38:47 */     bcm localbcm = paramaqu.s(paramdt);
/* 39:48 */     if ((localbcm instanceof bdi))
/* 40:   */     {
/* 41:49 */       bdi localbdi = (bdi)localbcm;
/* 42:   */       
/* 43:51 */       localbdi.b();
/* 44:52 */       localbdi.a(paramaqu, paramdt);
/* 45:   */     }
/* 46:55 */     return true;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void a(aqu paramaqu, dt paramdt, ahd paramahd)
/* 50:   */   {
/* 51:60 */     if (paramaqu.D) {
/* 52:61 */       return;
/* 53:   */     }
/* 54:64 */     bcm localbcm = paramaqu.s(paramdt);
/* 55:65 */     if ((localbcm instanceof bdi)) {
/* 56:66 */       ((bdi)localbcm).a(paramaqu, paramdt);
/* 57:   */     }
/* 58:   */   }
/* 59:   */   
/* 60:   */   public bcm a(aqu paramaqu, int paramInt)
/* 61:   */   {
/* 62:72 */     return new bdi();
/* 63:   */   }
/* 64:   */   
/* 65:   */   private String b(int paramInt)
/* 66:   */   {
/* 67:76 */     if ((paramInt < 0) || (paramInt >= a.size())) {
/* 68:77 */       paramInt = 0;
/* 69:   */     }
/* 70:80 */     return (String)a.get(paramInt);
/* 71:   */   }
/* 72:   */   
/* 73:   */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, int paramInt1, int paramInt2)
/* 74:   */   {
/* 75:85 */     float f = (float)Math.pow(2.0D, (paramInt2 - 12) / 12.0D);
/* 76:   */     
/* 77:87 */     paramaqu.a(paramdt.n() + 0.5D, paramdt.o() + 0.5D, paramdt.p() + 0.5D, "note." + b(paramInt1), 3.0F, f);
/* 78:88 */     paramaqu.a(ew.x, paramdt.n() + 0.5D, paramdt.o() + 1.2D, paramdt.p() + 0.5D, paramInt2 / 24.0D, 0.0D, 0.0D, new int[0]);
/* 79:89 */     return true;
/* 80:   */   }
/* 81:   */   
/* 82:   */   public int b()
/* 83:   */   {
/* 84:94 */     return 3;
/* 85:   */   }
/* 86:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ayn
 * JD-Core Version:    0.7.0.1
 */