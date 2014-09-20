/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bjj
/*   5:    */   extends bms
/*   6:    */ {
/*   7:    */   public bjj() {}
/*   8:    */   
/*   9:    */   public bjj(int paramInt, Random paramRandom, bjb parambjb, ej paramej)
/*  10:    */   {
/*  11:611 */     super(paramInt);
/*  12:612 */     this.m = paramej;
/*  13:613 */     this.l = parambjb;
/*  14:    */   }
/*  15:    */   
/*  16:    */   protected void a(fn paramfn) {}
/*  17:    */   
/*  18:    */   protected void b(fn paramfn) {}
/*  19:    */   
/*  20:    */   public static bjb a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, ej paramej)
/*  21:    */   {
/*  22:626 */     bjb localbjb = new bjb(paramInt1, paramInt2 - 5, paramInt3, paramInt1, paramInt2 + 2, paramInt3);
/*  23:628 */     switch (bjf.a[paramej.ordinal()])
/*  24:    */     {
/*  25:    */     case 1: 
/*  26:630 */       localbjb.d = (paramInt1 + 2);
/*  27:631 */       localbjb.c = (paramInt3 - 8);
/*  28:632 */       break;
/*  29:    */     case 2: 
/*  30:634 */       localbjb.d = (paramInt1 + 2);
/*  31:635 */       localbjb.f = (paramInt3 + 8);
/*  32:636 */       break;
/*  33:    */     case 3: 
/*  34:638 */       localbjb.a = (paramInt1 - 8);
/*  35:639 */       localbjb.f = (paramInt3 + 2);
/*  36:640 */       break;
/*  37:    */     case 4: 
/*  38:642 */       localbjb.d = (paramInt1 + 8);
/*  39:643 */       localbjb.f = (paramInt3 + 2);
/*  40:    */     }
/*  41:647 */     if (bms.a(paramList, localbjb) != null) {
/*  42:648 */       return null;
/*  43:    */     }
/*  44:651 */     return localbjb;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void a(bms parambms, List paramList, Random paramRandom)
/*  48:    */   {
/*  49:656 */     int i = d();
/*  50:659 */     if (this.m != null) {
/*  51:660 */       switch (bjf.a[this.m.ordinal()])
/*  52:    */       {
/*  53:    */       case 1: 
/*  54:662 */         bje.a(parambms, paramList, paramRandom, this.l.a, this.l.b, this.l.c - 1, ej.c, i);
/*  55:663 */         break;
/*  56:    */       case 2: 
/*  57:665 */         bje.a(parambms, paramList, paramRandom, this.l.a, this.l.b, this.l.f + 1, ej.d, i);
/*  58:666 */         break;
/*  59:    */       case 3: 
/*  60:668 */         bje.a(parambms, paramList, paramRandom, this.l.a - 1, this.l.b, this.l.c, ej.e, i);
/*  61:669 */         break;
/*  62:    */       case 4: 
/*  63:671 */         bje.a(parambms, paramList, paramRandom, this.l.d + 1, this.l.b, this.l.c, ej.f, i);
/*  64:    */       }
/*  65:    */     }
/*  66:    */   }
/*  67:    */   
/*  68:    */   public boolean a(aqu paramaqu, Random paramRandom, bjb parambjb)
/*  69:    */   {
/*  70:679 */     if (a(paramaqu, parambjb)) {
/*  71:680 */       return false;
/*  72:    */     }
/*  73:684 */     a(paramaqu, parambjb, 0, 5, 0, 2, 7, 1, aty.a.P(), aty.a.P(), false);
/*  74:    */     
/*  75:686 */     a(paramaqu, parambjb, 0, 0, 7, 2, 2, 8, aty.a.P(), aty.a.P(), false);
/*  76:688 */     for (int i = 0; i < 5; i++) {
/*  77:689 */       a(paramaqu, parambjb, 0, 5 - i - (i < 4 ? 1 : 0), 2 + i, 2, 7 - i, 2 + i, aty.a.P(), aty.a.P(), false);
/*  78:    */     }
/*  79:692 */     return true;
/*  80:    */   }
/*  81:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bjj
 * JD-Core Version:    0.7.0.1
 */