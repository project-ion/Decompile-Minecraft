/*  1:   */ import com.google.common.collect.Sets;
/*  2:   */ import java.util.Set;
/*  3:   */ 
/*  4:   */ public class amu
/*  5:   */   extends aks
/*  6:   */ {
/*  7:11 */   private static final Set c = Sets.newHashSet(new atr[] { aty.cs, aty.q, aty.e, aty.E, aty.ah, aty.ag, aty.T, aty.D, aty.R, aty.o, aty.aI, aty.S, aty.p, aty.y, aty.x, aty.aD, aty.Y, aty.aV, aty.cB, aty.av, aty.aC, aty.A, aty.cM, aty.b, aty.U });
/*  8:   */   
/*  9:   */   protected amu(ami paramami)
/* 10:   */   {
/* 11:40 */     super(2.0F, paramami, c);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public boolean b(atr paramatr)
/* 15:   */   {
/* 16:45 */     if (paramatr == aty.Z) {
/* 17:46 */       return this.b.d() == 3;
/* 18:   */     }
/* 19:48 */     if ((paramatr == aty.ah) || (paramatr == aty.ag)) {
/* 20:49 */       return this.b.d() >= 2;
/* 21:   */     }
/* 22:51 */     if ((paramatr == aty.bP) || (paramatr == aty.bT)) {
/* 23:52 */       return this.b.d() >= 2;
/* 24:   */     }
/* 25:54 */     if ((paramatr == aty.R) || (paramatr == aty.o)) {
/* 26:55 */       return this.b.d() >= 2;
/* 27:   */     }
/* 28:57 */     if ((paramatr == aty.S) || (paramatr == aty.p)) {
/* 29:58 */       return this.b.d() >= 1;
/* 30:   */     }
/* 31:60 */     if ((paramatr == aty.y) || (paramatr == aty.x)) {
/* 32:61 */       return this.b.d() >= 1;
/* 33:   */     }
/* 34:63 */     if ((paramatr == aty.aC) || (paramatr == aty.aD)) {
/* 35:64 */       return this.b.d() >= 2;
/* 36:   */     }
/* 37:66 */     if (paramatr.r() == bof.e) {
/* 38:67 */       return true;
/* 39:   */     }
/* 40:69 */     if (paramatr.r() == bof.f) {
/* 41:70 */       return true;
/* 42:   */     }
/* 43:72 */     if (paramatr.r() == bof.g) {
/* 44:73 */       return true;
/* 45:   */     }
/* 46:75 */     return false;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public float a(amj paramamj, atr paramatr)
/* 50:   */   {
/* 51:80 */     if ((paramatr.r() == bof.f) || (paramatr.r() == bof.g) || (paramatr.r() == bof.e)) {
/* 52:81 */       return this.a;
/* 53:   */     }
/* 54:83 */     return super.a(paramamj, paramatr);
/* 55:   */   }
/* 56:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     amu
 * JD-Core Version:    0.7.0.1
 */