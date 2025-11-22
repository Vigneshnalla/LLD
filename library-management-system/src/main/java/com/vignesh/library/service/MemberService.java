package com.vignesh.library.service;

import com.vignesh.library.model.entity.Member;
import com.vignesh.library.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;


    public Optional<Member> getMemberById(String memberId) {
        return memberRepository.findById(memberId);
    }

    public Optional<Member> getMemberByMembershipId(String membershipId) {
        return memberRepository.findByMembershipId(membershipId);
    }

    public List<Member> getMembersWithBorrowedBooks() {
        return memberRepository.findMembersWithBorrowedBooks();
    }

    public List<Member> getExpiredMemberships() {
        return memberRepository.findByMembershipExpiryDateBefore(LocalDate.now());
    }

    public Member renewMembership(String memberId, int years) {
        Optional<Member> memberOpt = memberRepository.findById(memberId);
        if (memberOpt.isPresent()) {
            Member member = memberOpt.get();
            member.setMembershipExpiryDate(LocalDate.now().plusYears(years));
            return memberRepository.save(member);
        }
        return null;
    }

}