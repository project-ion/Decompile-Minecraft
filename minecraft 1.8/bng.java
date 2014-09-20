/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bng
/*   5:    */   extends bnn
/*   6:    */ {
/*   7:    */   private boolean a;
/*   8:    */   
/*   9:    */   public bng() {}
/*  10:    */   
/*  11:    */   public bng(bnk parambnk, int paramInt, Random paramRandom, bjb parambjb, ej paramej)
/*  12:    */   {
/*  13:655 */     super(parambnk, paramInt);
/*  14:    */     
/*  15:657 */     this.m = paramej;
/*  16:658 */     this.l = parambjb;
/*  17:659 */     this.a = paramRandom.nextBoolean();
/*  18:    */   }
/*  19:    */   
/*  20:    */   protected void a(fn paramfn)
/*  21:    */   {
/*  22:664 */     super.a(paramfn);
/*  23:665 */     paramfn.a("Terrace", this.a);
/*  24:    */   }
/*  25:    */   
/*  26:    */   protected void b(fn paramfn)
/*  27:    */   {
/*  28:670 */     super.b(paramfn);
/*  29:671 */     this.a = paramfn.n("Terrace");
/*  30:    */   }
/*  31:    */   
/*  32:    */   public static bng a(bnk parambnk, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, ej paramej, int paramInt4)
/*  33:    */   {
/*  34:675 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, 0, 0, 0, 5, 6, 5, paramej);
/*  35:677 */     if (bms.a(paramList, localbjb) != null) {
/*  36:678 */       return null;
/*  37:    */     }
/*  38:681 */     return new bng(parambnk, paramInt4, paramRandom, localbjb, paramej);
/*  39:    */   }
/*  40:    */   
/*  41:    */   public boolean a(aqu paramaqu, Random paramRandom, bjb parambjb)
/*  42:    */   {
/*  43:686 */     if (this.h < 0)
/*  44:    */     {
/*  45:687 */       this.h = b(paramaqu, parambjb);
/*  46:688 */       if (this.h < 0) {
/*  47:689 */         return true;
/*  48:    */       }
/*  49:691 */       this.l.a(0, this.h - this.l.e + 6 - 1, 0);
/*  50:    */     }
/*  51:695 */     a(paramaqu, parambjb, 0, 0, 0, 4, 0, 4, aty.e.P(), aty.e.P(), false);
/*  52:    */     
/*  53:697 */     a(paramaqu, parambjb, 0, 4, 0, 4, 4, 4, aty.r.P(), aty.r.P(), false);
/*  54:698 */     a(paramaqu, parambjb, 1, 4, 1, 3, 4, 3, aty.f.P(), aty.f.P(), false);
/*  55:    */     
/*  56:    */ 
/*  57:701 */     a(paramaqu, aty.e.P(), 0, 1, 0, parambjb);
/*  58:702 */     a(paramaqu, aty.e.P(), 0, 2, 0, parambjb);
/*  59:703 */     a(paramaqu, aty.e.P(), 0, 3, 0, parambjb);
/*  60:704 */     a(paramaqu, aty.e.P(), 4, 1, 0, parambjb);
/*  61:705 */     a(paramaqu, aty.e.P(), 4, 2, 0, parambjb);
/*  62:706 */     a(paramaqu, aty.e.P(), 4, 3, 0, parambjb);
/*  63:707 */     a(paramaqu, aty.e.P(), 0, 1, 4, parambjb);
/*  64:708 */     a(paramaqu, aty.e.P(), 0, 2, 4, parambjb);
/*  65:709 */     a(paramaqu, aty.e.P(), 0, 3, 4, parambjb);
/*  66:710 */     a(paramaqu, aty.e.P(), 4, 1, 4, parambjb);
/*  67:711 */     a(paramaqu, aty.e.P(), 4, 2, 4, parambjb);
/*  68:712 */     a(paramaqu, aty.e.P(), 4, 3, 4, parambjb);
/*  69:713 */     a(paramaqu, parambjb, 0, 1, 1, 0, 3, 3, aty.f.P(), aty.f.P(), false);
/*  70:714 */     a(paramaqu, parambjb, 4, 1, 1, 4, 3, 3, aty.f.P(), aty.f.P(), false);
/*  71:715 */     a(paramaqu, parambjb, 1, 1, 4, 3, 3, 4, aty.f.P(), aty.f.P(), false);
/*  72:716 */     a(paramaqu, aty.bj.P(), 0, 2, 2, parambjb);
/*  73:717 */     a(paramaqu, aty.bj.P(), 2, 2, 4, parambjb);
/*  74:718 */     a(paramaqu, aty.bj.P(), 4, 2, 2, parambjb);
/*  75:    */     
/*  76:    */ 
/*  77:721 */     a(paramaqu, aty.f.P(), 1, 1, 0, parambjb);
/*  78:722 */     a(paramaqu, aty.f.P(), 1, 2, 0, parambjb);
/*  79:723 */     a(paramaqu, aty.f.P(), 1, 3, 0, parambjb);
/*  80:724 */     a(paramaqu, aty.f.P(), 2, 3, 0, parambjb);
/*  81:725 */     a(paramaqu, aty.f.P(), 3, 3, 0, parambjb);
/*  82:726 */     a(paramaqu, aty.f.P(), 3, 2, 0, parambjb);
/*  83:727 */     a(paramaqu, aty.f.P(), 3, 1, 0, parambjb);
/*  84:728 */     if ((a(paramaqu, 2, 0, -1, parambjb).c().r() == bof.a) && (a(paramaqu, 2, -1, -1, parambjb).c().r() != bof.a)) {
/*  85:729 */       a(paramaqu, aty.aw.a(a(aty.aw, 3)), 2, 0, -1, parambjb);
/*  86:    */     }
/*  87:733 */     a(paramaqu, parambjb, 1, 1, 1, 3, 3, 3, aty.a.P(), aty.a.P(), false);
/*  88:736 */     if (this.a)
/*  89:    */     {
/*  90:737 */       a(paramaqu, aty.aO.P(), 0, 5, 0, parambjb);
/*  91:738 */       a(paramaqu, aty.aO.P(), 1, 5, 0, parambjb);
/*  92:739 */       a(paramaqu, aty.aO.P(), 2, 5, 0, parambjb);
/*  93:740 */       a(paramaqu, aty.aO.P(), 3, 5, 0, parambjb);
/*  94:741 */       a(paramaqu, aty.aO.P(), 4, 5, 0, parambjb);
/*  95:742 */       a(paramaqu, aty.aO.P(), 0, 5, 4, parambjb);
/*  96:743 */       a(paramaqu, aty.aO.P(), 1, 5, 4, parambjb);
/*  97:744 */       a(paramaqu, aty.aO.P(), 2, 5, 4, parambjb);
/*  98:745 */       a(paramaqu, aty.aO.P(), 3, 5, 4, parambjb);
/*  99:746 */       a(paramaqu, aty.aO.P(), 4, 5, 4, parambjb);
/* 100:747 */       a(paramaqu, aty.aO.P(), 4, 5, 1, parambjb);
/* 101:748 */       a(paramaqu, aty.aO.P(), 4, 5, 2, parambjb);
/* 102:749 */       a(paramaqu, aty.aO.P(), 4, 5, 3, parambjb);
/* 103:750 */       a(paramaqu, aty.aO.P(), 0, 5, 1, parambjb);
/* 104:751 */       a(paramaqu, aty.aO.P(), 0, 5, 2, parambjb);
/* 105:752 */       a(paramaqu, aty.aO.P(), 0, 5, 3, parambjb);
/* 106:    */     }
/* 107:756 */     if (this.a)
/* 108:    */     {
/* 109:757 */       i = a(aty.au, 3);
/* 110:758 */       a(paramaqu, aty.au.a(i), 3, 1, 3, parambjb);
/* 111:759 */       a(paramaqu, aty.au.a(i), 3, 2, 3, parambjb);
/* 112:760 */       a(paramaqu, aty.au.a(i), 3, 3, 3, parambjb);
/* 113:761 */       a(paramaqu, aty.au.a(i), 3, 4, 3, parambjb);
/* 114:    */     }
/* 115:765 */     a(paramaqu, aty.aa.P().a(bbl.a, this.m), 2, 3, 1, parambjb);
/* 116:767 */     for (int i = 0; i < 5; i++) {
/* 117:768 */       for (int j = 0; j < 5; j++)
/* 118:    */       {
/* 119:769 */         b(paramaqu, j, 6, i, parambjb);
/* 120:770 */         b(paramaqu, aty.e.P(), j, -1, i, parambjb);
/* 121:    */       }
/* 122:    */     }
/* 123:774 */     a(paramaqu, parambjb, 1, 1, 2, 1);
/* 124:    */     
/* 125:776 */     return true;
/* 126:    */   }
/* 127:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bng
 * JD-Core Version:    0.7.0.1
 */